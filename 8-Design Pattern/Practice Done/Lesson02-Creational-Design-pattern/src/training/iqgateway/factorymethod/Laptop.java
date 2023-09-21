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
public class Laptop extends WorkStation{
    private String ram;
    private String ssd;
    private String cpu;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Laptop(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Laptop() {
    }

    public String getRAM(){
        return this.ram;
    }    

    public String getSSD(){
        return this.ssd;
    } 
    public String getCPU(){
        return this.cpu;
    } 


}
