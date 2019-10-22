package com.velatech.customerapi.exception;

import com.velatech.customerapi.response.CustomerResponse;
import org.springframework.http.ResponseEntity;

public class ResponseEntityErrorException   extends RuntimeException {
    private ResponseEntity<CustomerResponse> responseEntity;
    private CustomerResponse customerResponse;


    public ResponseEntityErrorException(ResponseEntity<CustomerResponse> errorResponse) {
        this.responseEntity = errorResponse;
    }


    public ResponseEntityErrorException(CustomerResponse errorResponse) {
        this.customerResponse = errorResponse;
    }

    public ResponseEntity<CustomerResponse> getResponseEntity() {
        return responseEntity;
    }

    public CustomerResponse getErrorResponse() {
        return customerResponse;
    }
}
