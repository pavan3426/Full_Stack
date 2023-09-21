package training.iqgateway;

import javax.jws.WebService;

@WebService
public class Hello {
    
    public String sayHello(String name){
        return "welcome" + name+ " to new era of developing Web Apps";
    }
}
