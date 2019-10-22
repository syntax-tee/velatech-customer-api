package com.velatech.customerapi.controller;


import com.velatech.customerapi.respository.CustomerRepository;
import com.velatech.customerapi.service.CustomerService;
import com.velatech.customerapi.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/card-scheme")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping(path = "/verify/{bin}", headers = "Accept-Version: 3", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CustomerResponse> verifyCard(@PathVariable long  bin){
        ResponseEntity<CustomerResponse> customerResponse =  customerService.verifyCardService(bin);
        if(customerResponse.getStatusCode().is4xxClientError()){
            return new ResponseEntity<CustomerResponse>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CustomerResponse>((MultiValueMap<String, String>) customerResponse, HttpStatus.OK);
    }
}
