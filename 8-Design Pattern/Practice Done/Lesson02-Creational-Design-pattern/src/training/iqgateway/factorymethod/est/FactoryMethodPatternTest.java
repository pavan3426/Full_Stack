/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.factorymethod.est;

import training.iqgateway.factorymethod.WorkStationFactory;
import training.iqgateway.factorymethod.WorkStation;
/**
 *
 * @author pavankumar.boyapati
 */
public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        WorkStation laptopRef = WorkStationFactory
                .getWorkStation("Laptop","8 GB ","480GB","2.4GH");
    
        WorkStation serverRef = WorkStationFactory
                .getWorkStation("Server","32GB","1000TB","3.0GHz");
        System.out.println("Factory laptop Config Details"+laptopRef);
         System.out.println("Factory server Config Details"+serverRef);
                
    
    }
            
}
