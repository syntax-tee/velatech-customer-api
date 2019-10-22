package com.velatech.customerapi.service;


import com.velatech.customerapi.response.CustomerResponse;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
     ResponseEntity<CustomerResponse> verifyCardService(long param);
}