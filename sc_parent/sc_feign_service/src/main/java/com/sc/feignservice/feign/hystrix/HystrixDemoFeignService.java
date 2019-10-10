package com.sc.feignservice.feign.hystrix;

import com.sc.feignservice.feign.DemoFeignService;
import org.springframework.stereotype.Component;

@Component
public class HystrixDemoFeignService implements DemoFeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "服务出错，请稍后重试";
    }
}
