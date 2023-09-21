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
public class SocketClassAdapterIml extends Socket implements SocketAdapter {
    
    public Volt get120Volt(){
      return getVolt();
    }
    public Volt get12Volt(){
       Volt v = getVolt();
        return convertVolt(v,10);
    }
    public Volt get3Volt(){
       Volt v = getVolt();
        return convertVolt(v,40);
    }
    
    private Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }
    
}
