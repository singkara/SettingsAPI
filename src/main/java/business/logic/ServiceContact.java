package business.logic;

public class ServiceContact {
    private String individualName;
    private String positionName;
    private Address address;

    public ServiceContact() {
    }

    public ServiceContact(String individualName, String positionName, Address address) {
        this.individualName = individualName;
        this.positionName = positionName;
        this.address = address;
    }

    public void setIndividualName(String individualName) {
        this.individualName = individualName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getIndividualName() {
        return individualName;
    }

    public String getPositionName() {
        return positionName;
    }

    public Address getAddress() {
        return address;
    }
}
