/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.mediator;

/**
 *
 * @author pavankumar.boyapati
 */
public class ChatClient {
    
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1= new UserImpl(mediator, "Pavan");
        User user2= new UserImpl(mediator, "Rocky");
        User user3= new UserImpl(mediator, "Devara");
        User user4= new UserImpl(mediator, "Ram");
        User user5= new UserImpl(mediator, "Selvi");
        
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);
        
        user1.send("Hello Everyone.....");
        
        
        
    }
}
