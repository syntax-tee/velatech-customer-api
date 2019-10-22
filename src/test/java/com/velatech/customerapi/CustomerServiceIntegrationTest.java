package com.velatech.customerapi;


import com.velatech.customerapi.entities.Customer;
import com.velatech.customerapi.response.CustomerResponse;
import com.velatech.customerapi.respository.CustomerRepository;
import com.velatech.customerapi.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CustomerServiceIntegrationTest {


    @Autowired
    CustomerService customerService;


//    @Autowired
//    CustomerRepository customerRepository;
//
//
//    long bin = 45717360;
//    CustomerResponse customerResponse  =  customerService.verifyCardService(bin);
//
//

}
