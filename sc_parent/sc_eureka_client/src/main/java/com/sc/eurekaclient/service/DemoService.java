package com.sc.eurekaclient.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String sayHi(String name){
        return "hello " + name;
    }
}
