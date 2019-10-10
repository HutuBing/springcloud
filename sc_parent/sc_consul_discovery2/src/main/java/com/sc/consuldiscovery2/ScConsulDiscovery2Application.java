package com.sc.consuldiscovery2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ScConsulDiscovery2Application {

    public static void main(String[] args) {
        SpringApplication.run(ScConsulDiscovery2Application.class, args);
    }
}
