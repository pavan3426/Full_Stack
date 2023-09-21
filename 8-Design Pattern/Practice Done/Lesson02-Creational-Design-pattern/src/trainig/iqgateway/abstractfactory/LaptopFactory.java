/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainig.iqgateway.abstractfactory;

/**
 *
 * @author pavankumar.boyapati
 */
public class LaptopFactory implements ComputerAbstractFactory {
    
    
    private String ram;
    private String ssd;
    private String cpu;

    public LaptopFactory(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }
    
    public WorkStation createWorkStation(){
        return new Laptop(ram,ssd,cpu);
    }
}
