package business.logic;

import java.util.List;

public class ServiceIdentification {
    private String title;
    private String serviceAbstract;
    private List<String> keywords;
    private String serviceType;
    private String ServiceTypeVersion;
    private String fees;
    private String accessConstraints;

    public ServiceIdentification() {
    }

    public ServiceIdentification(String title, String serviceAbstract, List<String> keywords, String serviceType, String serviceTypeVersion, String fees, String accessConstraints) {
        this.title = title;
        this.serviceAbstract = serviceAbstract;
        this.keywords = keywords;
        this.serviceType = serviceType;
        ServiceTypeVersion = serviceTypeVersion;
        this.fees = fees;
        this.accessConstraints = accessConstraints;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setServiceAbstract(String serviceAbstract) {
        this.serviceAbstract = serviceAbstract;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setServiceTypeVersion(String serviceTypeVersion) {
        ServiceTypeVersion = serviceTypeVersion;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public void setAccessConstraints(String accessConstraints) {
        this.accessConstraints = accessConstraints;
    }

    public String getTitle() {
        return title;
    }

    public String getServiceAbstract() {
        return serviceAbstract;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getServiceTypeVersion() {
        return ServiceTypeVersion;
    }

    public String getFees() {
        return fees;
    }

    public String getAccessConstraints() {
        return accessConstraints;
    }
}
