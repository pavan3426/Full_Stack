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
public class WorkStationFactory {
//Factory is a place where products are created    
//in java :- Factory is a place where objects are created
    
    public static WorkStation getWorkStation(String givenType, String givenRam,
                                             String givenSsd,String givenCpu){
        if("Laptop".equalsIgnoreCase(givenType)){
            return new Laptop(givenRam,givenSsd,givenCpu);
        }
        else if ("Server".equalsIgnoreCase(givenType)){
            return new Server (givenRam, givenSsd, givenCpu);
        }
        return null;
        
    }
    
    
    
}
