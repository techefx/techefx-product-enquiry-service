package com.techefx.microservices.productenquiryservice.techefxproductenquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.techefx.microservices.productenquiryservice")
//.techefxproductenquiryservice
public class TechefxProductEnquiryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechefxProductEnquiryServiceApplication.class, args);
    }

}
