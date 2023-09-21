/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.adapter;

/**
 *
 * @author pavankumar.boyapati
 */
public class AdapterPatternTester {
    
    public static void main(String[] args){
          testObjectAdapter();
        testClassAdapter();
      
    }
    
    private static Volt getVolt(SocketAdapter socketAdapterRef, int i){
        switch(i){
            case 3: return socketAdapterRef.get3Volt();
            case 12 : return socketAdapterRef.get12Volt();
            case 120: return socketAdapterRef.get120Volt();
            default: return socketAdapterRef.get120Volt();
        }
    }
    
    private static void testObjectAdapter(){
        SocketAdapter socketAdapterRef1 =new SocketObjectAdapterImpl();
        Volt v3= getVolt(socketAdapterRef1,3);
        Volt v12= getVolt(socketAdapterRef1,12);
        Volt v120= getVolt(socketAdapterRef1,120);
        System.out.println("V3 Volts Using Object Adapter = "+v3.getVolts());
        System.out.println("V12 Volts Using Object Adapter = "+v12.getVolts());
        System.out.println("V120 Volts Using Object Adapter = "+v120.getVolts());
                
    }
    private static void testClassAdapter(){
        SocketAdapter socketAdapterRef =  new SocketClassAdapterIml();
        Volt v3= getVolt(socketAdapterRef,3);
        Volt v12= getVolt(socketAdapterRef,12);
        Volt v120= getVolt(socketAdapterRef,120);
        System.out.println("V3 Volts Using Class Adapter = "+v3.getVolts());
        System.out.println("V12 Volts Using Class Adapter = "+v12.getVolts());
        System.out.println("V120 Volts Using Class Adapter = "+v120.getVolts());
          
    }
    
    
}
