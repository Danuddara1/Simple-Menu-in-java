public class Customer {
    private String cname;
    private String cemail;
    private String cusername;
    private String cpassword;
    private String cphoneNumber;

    public Customer(String cname, String cemail,String cusername,String cpassword , String cphoneNumber) {
        this.cname = cname;
        this.cemail = cemail;
        this.cusername = cusername;
        this.cpassword = cpassword;
        this.cphoneNumber = cphoneNumber;
    }
    
}
// need a method that will check the password and return a boolean value 
