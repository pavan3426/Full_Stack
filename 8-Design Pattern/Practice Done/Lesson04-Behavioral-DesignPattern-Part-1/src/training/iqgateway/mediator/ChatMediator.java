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
public interface ChatMediator {
    public void sendmessage(String msg, User user);
    
    void addUser(User user);
}
