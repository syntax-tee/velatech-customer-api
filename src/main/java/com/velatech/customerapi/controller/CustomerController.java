package com.velatech.customerapi.controller;


import com.velatech.customerapi.dto.CustomerDto;
import com.velatech.customerapi.response.customer.Payload;
import com.velatech.customerapi.service.CustomerService;
import com.velatech.customerapi.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(path = "/verify/{bin}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CustomerDto> verifyCard(@PathVariable long  bin){
        CustomerResponse customerResponse  =  customerService.verifyCardService(bin);
        CustomerDto customerDto = new CustomerDto();
        Payload payload = new Payload();

        if(customerResponse!=null){
            customerDto.setId(0L);
            customerDto.setSuccess(true);
            payload.setBank(customerResponse.getBank().getName() != null ? customerResponse.getBank().getName():" ");
            payload.setScheme(customerResponse.getScheme() != null ? customerResponse.getScheme() :" ");
            payload.setType(customerResponse.getType() != null ? customerResponse.getType() : "");
            customerDto.setPayload(payload);
        }else {
            return new ResponseEntity<CustomerDto>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerDto, HttpStatus.OK);
    }
}
