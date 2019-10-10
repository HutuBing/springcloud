package com.sc.feignservice.controller;

import com.sc.feignservice.feign.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    private DemoFeignService demoFeignService;

    @GetMapping(value = "/demo")
    public String demo(@RequestParam String name){

        return demoFeignService.sayHiFromClientOne(name);

    }


}
