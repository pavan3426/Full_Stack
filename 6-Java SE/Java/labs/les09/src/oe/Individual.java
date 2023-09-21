package oe;

public class Individual extends Customer {
    String name;
    String address;
    int phone;
    int licenseNumber;
    
    
    public Individual(String name, String address, int phone, int licenseNumber) {
        
        super();
        this.name=name;
        this.address= address;
        this.phone= phone;
        this.licenseNumber=licenseNumber;
    }
    
    
    public String tostring(){
        return "(" + licenseNumber +")" ;
        
    }
    
    
    
}
