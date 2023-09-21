/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.observer;

/**
 *
 * @author pavankumar.boyapati
 */
public interface Subject {
    //Methods to register and un register
   
    public void register(Observer obs);
   
   public void unregister(Observer obs);
   
   // Notify Observers of some Changes
   public void notifyObservers();
   
   //Method to get Update from the Subject
   public Object getUpdate(Observer obs);
   
   
    
}
