
package Class;


public class BillDetails {
    private int Billid;
    private int Customerid;
    private String customernic;
    private String month;
    private String Units;
    private String total;
    private String payment;

    public BillDetails(int Billid, int Customerid, String customernic, String month, String Units, String total, String payment) {
        this.Billid = Billid;
        this.Customerid = Customerid;
        this.customernic = customernic;
        this.month = month;
        this.Units = Units;
        this.total = total;
        this.payment = payment;
    }

    public int getBillid() {
        return Billid;
    }

    public void setBillid(int Billid) {
        this.Billid = Billid;
    }

    public int getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(int Customerid) {
        this.Customerid = Customerid;
    }

    public String getCustomernic() {
        return customernic;
    }

    public void setCustomernic(String customernic) {
        this.customernic = customernic;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getUnits() {
        return Units;
    }

    public void setUnits(String Units) {
        this.Units = Units;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
    

}  