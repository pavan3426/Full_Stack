package oe;

public class DataMan {
    
    private static Customer[] customers =null;
    
    public static void buildCustomers(){
        
        
        if (customers != null)
        return;
        customers = new Customer[6];
        customers[0]= 
           new Customer("Gary Williams", "Houston, TX", "713.555.8765");

         customers[1] =
           new Customer("Lynn Munsinger", "Orlando, FL", "407.695.2210");

         customers[2] = 
           new Customer("Rachael O'leary", "Brisbane, QLD", "07.3031.1100");

         customers[3] = 
           new Customer("Tony Obermeit", "Brisbane, QLD", "07.3031.9987");

         customers[4] = 
           new Company("Oracle", "Redwood Shores", "80", "Larry Ellison", 20);

        Individual customers[5] = 
           new Individual("Kate", "Baithentwaits", "676881", "54321");

    }
    
    
  
    
    static {
        
     buildCustomers();   
        
    }
    public static findCustomerById(int custId)
    
    for(Customer cu :customers){
        
        if( custId == cu.getId()){
        return cu;
        }
        return null;
    }
    }
    

