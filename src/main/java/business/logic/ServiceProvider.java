package business.logic;

public class ServiceProvider {
    private String providerName;
    private String providerSite;
    private ServiceContact serviceContact;

    public ServiceProvider() {
    }

    public ServiceProvider(String providerName, String providerSite, ServiceContact serviceContact) {
        this.providerName = providerName;
        this.providerSite = providerSite;
        this.serviceContact = serviceContact;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setProviderSite(String providerSite) {
        this.providerSite = providerSite;
    }

    public void setServiceContact(ServiceContact serviceContact) {
        this.serviceContact = serviceContact;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getProviderSite() {
        return providerSite;
    }

    public ServiceContact getServiceContact() {
        return serviceContact;
    }
}
