package com.velatech.customerapi.exception;

import com.velatech.customerapi.response.CustomerResponse;
import org.springframework.http.ResponseEntity;

public class ResponseEntityErrorException   extends RuntimeException {
    private ResponseEntity<CustomerResponse> responseEntity;
    private CustomerResponse stationBankAccountResponse;


    public ResponseEntityErrorException(ResponseEntity<CustomerResponse> errorResponse) {
        this.responseEntity = errorResponse;
    }


    public ResponseEntityErrorException(CustomerResponse errorResponse) {
        this.stationBankAccountResponse = errorResponse;
    }

    public ResponseEntity<CustomerResponse> getResponseEntity() {
        return responseEntity;
    }

    public CustomerResponse getErrorResponse() {
        return stationBankAccountResponse;
    }
}
