package com.privalia.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.privalia.model.Client;
import com.privalia.model.Policy;
import com.privalia.repository.ClientRepository;
import com.privalia.repository.PolicyRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class SaveDataService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PolicyRepository policyRepository;

    public void saveClients(String dataClients) throws Exception{

        JSONObject jsonClients = new JSONObject(dataClients);

        Iterator<String> keys = jsonClients.keys();

        while(keys.hasNext()) {
            String key = keys.next();
            JSONArray jsonArray = jsonClients.getJSONArray(key);
            if (null != jsonArray) {
                for (int i= 0; i< jsonArray.length(); i++) {
                    Object obj = jsonArray.get(i);
                    ObjectMapper m = new ObjectMapper();
                    Client client = m.readValue(obj.toString(), Client.class);
                    clientRepository.save(client);
                }
            }
        }
    }

    public void savePolicies(String dataClients) throws Exception{

        JSONObject jsonClients = new JSONObject(dataClients);

        Iterator<String> keys = jsonClients.keys();

        while(keys.hasNext()) {
            String key = keys.next();
            JSONArray jsonArray = jsonClients.getJSONArray(key);
            if (null != jsonArray) {
                for (int i= 0; i< jsonArray.length(); i++) {
                    Object obj = jsonArray.get(i);
                    ObjectMapper m = new ObjectMapper();
                    Policy policy = m.readValue(obj.toString(), Policy.class);
                    policyRepository.save(policy);
                }
            }
        }
    }

}
