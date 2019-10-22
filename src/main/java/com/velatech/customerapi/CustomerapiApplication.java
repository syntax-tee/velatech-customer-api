package com.velatech.customerapi;

import com.velatech.customerapi.exception.ResponseEntityErrorHandler;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomerapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerapiApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntityErrorHandler errorHandler = new ResponseEntityErrorHandler();
        errorHandler.setMessageConverters(restTemplate.getMessageConverters());
        restTemplate.setErrorHandler(errorHandler);
        return restTemplate;
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


}
