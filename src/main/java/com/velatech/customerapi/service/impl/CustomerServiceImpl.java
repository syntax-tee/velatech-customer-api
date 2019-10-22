package com.velatech.customerapi.service.impl;

import com.velatech.customerapi.client.BinListClient;
import com.velatech.customerapi.dto.CustomerDto;
import com.velatech.customerapi.response.CustomerResponse;
import com.velatech.customerapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    BinListClient binListClient;

    CustomerServiceImpl(){
        binListClient = BinListClient.getInstance();
    }

    @Override
    public CustomerResponse verifyCardService(long bin) {
        return binListClient.verifyCustomerCard(bin);
    }
}
