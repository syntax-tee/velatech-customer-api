package com.velatech.customerapi.service;


import com.velatech.customerapi.response.CustomerResponse;

public interface CustomerService {
     CustomerResponse verifyCardService(long param);
}