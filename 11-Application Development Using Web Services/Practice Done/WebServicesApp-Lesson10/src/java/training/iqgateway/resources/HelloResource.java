/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.resources;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
/**
 *
 * @author pavankumar.boyapati
 */

@Path("hello")
public class HelloResource {
   
    private String welcomeMSG = "Welcome to the new era of Developing Web Services";
    @GET
    public String sayHello(){
        return welcomeMSG;
    }
    
}
