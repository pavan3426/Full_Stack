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


// Object Adaptor Based on Composition
public class SocketObjectAdapterImpl extends Socket implements SocketAdapter {
    //Composition
    private Socket socketRef= new Socket();
    
    public Volt get120Volt(){
        return socketRef.getVolt();
    }

        public Volt get12Volt() {
        Volt v=socketRef.getVolt();
        return convertVolt(v, 10);
        }


        public Volt get3Volt() {
        Volt v=socketRef.getVolt();
        return convertVolt(v, 40);
         }

        private Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
        }
    
}
