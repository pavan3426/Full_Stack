/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.factorymethod;

/**
 *
 * @author pavankumar.boyapati
 */
public abstract class WorkStation {
    
    public abstract String getRAM();
    
    public abstract String getSSD();
    
    public abstract String getCPU();
    
    public String toString(){
        return "Details [ RAM : "+this.getRAM() +", SSD : "+ this.getSSD()+
                ", CPU : "+ this.getCPU()+" ]";
    }
}
