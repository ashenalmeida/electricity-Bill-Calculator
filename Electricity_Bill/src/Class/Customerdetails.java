
package Class;


public class Customerdetails {
    private int customerid;
    private String cusname;
    private String cusaddress;
    private String cusnic;
    private String contact;

    public Customerdetails(int customerid, String cusname, String cusaddress, String cusnic, String contact) {
        this.customerid = customerid;
        this.cusname = cusname;
        this.cusaddress = cusaddress;
        this.cusnic = cusnic;
        this.contact = contact;
    }
    
    

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getCusaddress() {
        return cusaddress;
    }

    public void setCusaddress(String cusaddress) {
        this.cusaddress = cusaddress;
    }

    public String getCusnic() {
        return cusnic;
    }

    public void setCusnic(String cusnic) {
        this.cusnic = cusnic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
