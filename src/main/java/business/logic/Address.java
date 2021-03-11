package business.logic;

public class Address {
    private String deliveryPoint;
    private String city;
    private String administrativeArea;
    private String postalCode;
    private String country;
    private String email;
    private String hoursOfService;
    private String contactInstructions;

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHoursOfService(String hoursOfService) {
        this.hoursOfService = hoursOfService;
    }

    public void setContactInstructions(String contactInstructions) {
        this.contactInstructions = contactInstructions;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public String getCity() {
        return city;
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getHoursOfService() {
        return hoursOfService;
    }

    public String getContactInstructions() {
        return contactInstructions;
    }

    public Address(String deliveryPoint, String city, String administrativeArea, String postalCode, String country, String email, String hoursOfService, String contactInstructions) {
        this.deliveryPoint = deliveryPoint;
        this.city = city;
        this.administrativeArea = administrativeArea;
        this.postalCode = postalCode;
        this.country = country;
        this.email = email;
        this.hoursOfService = hoursOfService;
        this.contactInstructions = contactInstructions;
    }

    public Address() {
    }
}
