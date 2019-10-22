package com.velatech.customerapi.service.impl;

import com.velatech.customerapi.client.BinListClient;
import com.velatech.customerapi.entities.Customer;
import com.velatech.customerapi.response.CustomerResponse;
import com.velatech.customerapi.respository.CustomerRepository;
import com.velatech.customerapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    BinListClient binListClient;

    @Autowired
    CustomerRepository customerRepository;;

    private static int counter;

    CustomerServiceImpl(){
        binListClient = BinListClient.getInstance();
    }

    @Override
    public CustomerResponse verifyCardService(long bin) {
        Customer customer = new Customer();
        CustomerResponse customerResponse = binListClient.verifyCustomerCard(bin);
        if(customerResponse!= null){
            customer.setBank(customerResponse.getBank().getName() != null? customerResponse.getBank().getName(): "");
            customer.setNumber_of_hits(++counter);
            customer.setScheme(customerResponse.getScheme() != null ? customerResponse.getScheme() : "");
            customer.setBin(bin);
            customer.setSuccess(true);
            customerRepository.save(customer);
        }else{
            customer.setBank("");
            customer.setScheme("");
            customer.setBin(bin);
            customer.setSuccess(false);
            customerRepository.save(customer);
        }
        return  customerResponse;
    }
}
