package training.iqgateway.view;

public class LoginBean {
    private String userName;
    
    private String password;
    
    public LoginBean(){
        
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public String navigate(){
        System.out.println("Action event from bean used for navigation is called...! ");
        if(userName.equals("IQGateway") && password.equals("12345678")){
            return "success";
        }
        else{
            return "false";
        }
        }
}