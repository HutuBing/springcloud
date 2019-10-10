package com.sc.feignservice.feign;

import com.sc.feignservice.feign.hystrix.HystrixDemoFeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "sc-eureka-client", fallback = HystrixDemoFeignService.class)
public interface DemoFeignService {

    @RequestMapping(value = "demo/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
