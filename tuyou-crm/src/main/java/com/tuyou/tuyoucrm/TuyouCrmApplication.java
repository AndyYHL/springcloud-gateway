package com.tuyou.tuyoucrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TuyouCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuyouCrmApplication.class, args);
    }
}
