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
public class UserImpl extends User {
    public UserImpl(ChatMediator med, String name){
        super(med,name);
        
    } 
    public void send(String msg){
        System.out.println(this.name + "  : Sending Message = "+msg);
    mediator.sendmessage(msg, this);
    }
    public void receive(String msg){
        System.out.println(this.name + "  : Received Message = "+msg);
    
    }
}
