package com.sc.eurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScEurekaServer2Application {

    public static void main(String[] args) {

        SpringApplication.run(ScEurekaServer2Application.class, args);

    }


}
