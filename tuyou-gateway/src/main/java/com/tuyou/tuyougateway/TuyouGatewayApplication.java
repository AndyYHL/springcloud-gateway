package com.tuyou.tuyougateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TuyouGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuyouGatewayApplication.class, args);
    }
}
