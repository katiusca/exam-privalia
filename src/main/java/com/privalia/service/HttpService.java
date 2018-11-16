package com.privalia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpService {

    @Value("${sources.clients}")
    String uriClients;

    @Value("${sources.policies}")
    String uriPolicies;

    @Autowired
    private SaveDataService saveDataService;

    public void  getClients() throws Exception{
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uriClients, String.class, 200);
        saveDataService.saveClients(result);
    }

    public void  getPolicies() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uriPolicies, String.class, 200);
        saveDataService.savePolicies(result);
    }
}
