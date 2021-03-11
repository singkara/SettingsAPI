package com.example.North.SettingsAPI;

import business.logic.Address;
import business.logic.ServiceContact;
import business.logic.ServiceIdentification;
import business.logic.ServiceProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class SettingsRESTService {

    @RequestMapping("/sample")
    public List<String> getSample(){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        return list;
    }




    @RequestMapping("/serviceIdentification")
    public List<ServiceIdentification> getServiceIdentificationDetails(){

        // Creating Dummy Object
        ServiceIdentification serviceIdentification = new ServiceIdentification();
        serviceIdentification.setTitle("javaPS");
        serviceIdentification.setServiceAbstract("52North WPS 2.0 Service");
        serviceIdentification.setKeywords(Arrays.asList("OGC", "52North WPS 2.0 Service"));
        serviceIdentification.setServiceType("OGC:WPS");
        serviceIdentification.setServiceTypeVersion("2.0.0");
        serviceIdentification.setFees("NONE");
        serviceIdentification.setAccessConstraints("NONE");

        // Return Json
        return Collections.singletonList(serviceIdentification);
    }



    @RequestMapping("/serviceProvider")
    public List<ServiceProvider> getServiceProviderDetails(){

        // Creating Dummy Object
        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.setProviderSite("https://github.com/orgs/52North/teams/geoprocessing/member");
        serviceProvider.setProviderName("52North");

        ServiceContact serviceContact = new ServiceContact();
        serviceContact.setIndividualName("Benjamin Pross");
        serviceContact.setPositionName("Software Engineer");
        Address address = new Address();
        address.setDeliveryPoint("Martin-Luther-King-Weg 24");
        address.setCity("Münster");
        address.setAdministrativeArea("North Rhine-Westphalia");
        address.setPostalCode("48155");
        address.setCountry("Germany");
        address.setEmail("b.pross @52north.org");
        serviceContact.setAddress(address);

        serviceProvider.setServiceContact(serviceContact);
        // Return Json
        return Collections.singletonList(serviceProvider);
    }

}
