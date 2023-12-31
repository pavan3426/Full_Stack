package examples.jms.topic;

import java.io.*;
import java.util.*;
import javax.transaction.*;
import javax.naming.*;
import javax.jms.*;
import javax.rmi.PortableRemoteObject;

public class TopicReceive implements MessageListener {

 // Defines the JNDI context factory.
  public final static String JNDI_FACTORY="weblogic.jndi.WLInitialContextFactory";
  // Defines the JMS connection factory for the topic.
  public final static String JMS_FACTORY="BibleJMSFactory";
  // Defines the topic.
  public final static String TOPIC="BibleJMSTopic";

  private TopicConnectionFactory tconFactory;
  private TopicConnection tcon;
  private TopicSession tsession;
  private TopicSubscriber tsubscriber;
  private Topic topic;
  private boolean quit = false;

 /**
  * Message listener interface.
  * @param msg message
  */
  public void onMessage(Message msg) {
    try {
      String msgText;

      if (msg instanceof TextMessage) {
        msgText = ((TextMessage)msg).getText();
      } else {
        msgText = msg.toString();
      }

      System.out.println("JMS Message Received: "+ msgText );

      if (msgText.equalsIgnoreCase("quit")) {
        synchronized(this) {
          quit = true;
          this.notifyAll(); // Notify main thread to quit
        }
      }
    } catch (JMSException jmse) {
      jmse.printStackTrace();
    }
  }

  public void init(Context ctx, String topicName)
    throws NamingException, JMSException
  {
    tconFactory = (TopicConnectionFactory) 
      PortableRemoteObject.narrow(ctx.lookup(JMS_FACTORY), 
                                  TopicConnectionFactory.class);
    tcon = tconFactory.createTopicConnection();
    tsession = tcon.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
    topic = (Topic) 
      PortableRemoteObject.narrow(ctx.lookup(topicName), 
                                  Topic.class);
    tsubscriber = tsession.createSubscriber(topic);
    tsubscriber.setMessageListener(this);
    tcon.start();
  }

  /**
   * Closes JMS objects.
   *
   * @exception JMSException if JMS fails to close objects due to internal error
   */
  public void close() throws JMSException {
    tsubscriber.close();
    tsession.close();
    tcon.close();
  }

 /**
  * main() method.
  *
  * @param args WebLogic Server URL
  * @exception Exception if execution fails
  */
  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      System.out.println("Usage: java examples.jms.topic.TopicReceive WebLogicURL");
      return;
    }
    InitialContext ic = getInitialContext(args[0]);
    TopicReceive tr = new TopicReceive();
    tr.init(ic, TOPIC);

    System.out.println("JMS Ready To Receive Messages (To quit, send a \"quit\" message).");

    // Wait until a "quit" message has been received.
    synchronized(tr) {
      while (! tr.quit) {
        try {
          tr.wait();
        } catch (InterruptedException ie) {}
      }
    }
    tr.close();
  }

  private static InitialContext getInitialContext(String url)
    throws NamingException
  {
    Hashtable env = new Hashtable();
    env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
    env.put(Context.PROVIDER_URL, url);
    env.put("weblogic.jndi.createIntermediateContexts", "true");
    return new InitialContext(env);
  }

}



