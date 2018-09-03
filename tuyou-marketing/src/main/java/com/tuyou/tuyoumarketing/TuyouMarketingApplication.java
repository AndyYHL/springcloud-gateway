package com.tuyou.tuyoumarketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TuyouMarketingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuyouMarketingApplication.class, args);
    }
}
