package training.iqgateway.oracle.model;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import oracle.service.SessionEJB08;

public class SessionEJB08Client {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            SessionEJB08 sessionEJB08 = (SessionEJB08)context.lookup("Application_08-Model-SessionEJB08#oracle.service.SessionEJB08");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://localhost:7101");
        return new InitialContext( env );
    }
}
