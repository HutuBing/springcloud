package com.sc.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ScEurekaClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(ScEurekaClientApplication.class, args);

    }


}
