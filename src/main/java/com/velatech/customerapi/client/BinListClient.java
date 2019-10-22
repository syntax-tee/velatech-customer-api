package com.velatech.customerapi.client;

import com.velatech.customerapi.ResponseEntityErrorHandler;
import com.velatech.customerapi.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BinListClient {

    @Autowired
    RestTemplate restTemplate;

//    private static BinListClient instance;


//    public static BinListClient getInstance() {
//        if (instance == null) {
//            instance = new BinListClient();
//        }
//        return instance;
//    }

    @Value("${binlist.main_url}")
    private String API_MAIN_URL;

    public BinListClient() {
        restTemplate = new RestTemplate();
        ResponseEntityErrorHandler errorHandler = new ResponseEntityErrorHandler();
        errorHandler.setMessageConverters(restTemplate.getMessageConverters());
        restTemplate.setErrorHandler(errorHandler);
    }

    public ResponseEntity<CustomerResponse> verifyCard(long id) {
        return restTemplate.getForEntity(API_MAIN_URL + id , CustomerResponse.class);
    }

}