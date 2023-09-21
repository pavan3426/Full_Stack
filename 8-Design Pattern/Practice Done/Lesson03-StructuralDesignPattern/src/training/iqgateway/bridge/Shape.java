/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.bridge;

/**
 *
 * @author pavankumar.boyapati
 */
public abstract class Shape  {
    protected Color color;
    
    public Shape(Color c){
        this.color=c;
    }
    public abstract void applyColor();
    
}