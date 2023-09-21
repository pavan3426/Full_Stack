package training.iqgateway;

import javax.jws.WebService;

// Business Class Where Logics of the Applications Reside

@WebService
public class CurrencyConvertor {
    
    public double dollarToRS(double dollars){
        return 69.34*dollars;
    }
    
    public double poundsToRs(double pounds){
        return 72.89 * pounds;
    }
    
    public double yensToRs(double yens){
        return 0.5* yens;
    }
}
