package business.logic;

public class ContactInfo {
    private String phone;
    private String fax;


    public ContactInfo(String phone, String fax) {
        this.phone = phone;
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
