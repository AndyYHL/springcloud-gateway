package com.tuyou.tuyouorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TuyouOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuyouOrderApplication.class, args);
    }
}
