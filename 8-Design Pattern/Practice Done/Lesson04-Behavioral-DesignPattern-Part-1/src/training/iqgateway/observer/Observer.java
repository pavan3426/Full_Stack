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
public interface Observer {

    //Method to update Observer , used by Subject
    public void update();

    //Attach with Subject to Observer
    public void setSubject(Subject sub);

}
