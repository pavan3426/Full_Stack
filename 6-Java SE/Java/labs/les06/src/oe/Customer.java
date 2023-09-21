package oe;

public class Customer 
{
  private int id;
  private String name;
  private String address;
  private String phone;
    private static int nextCustomerId =0;
    

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    public Customer(){
        nextCustomerId++;
        setId(nextCustomerId);
    }
    
    public Customer(String name,String address, String phone){
        this();
        this.name=name;
        this.address= address;
        this.phone=phone;
    }




    public String  toString(){
        
     return id+ " "+ name +" "+ address+ " "+ phone;
     
    }
    }

