package com.sc.eurekaclient.controller;

import com.sc.eurekaclient.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return demoService.sayHi(name);
    }


}
