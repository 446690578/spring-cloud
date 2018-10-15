package com.ben.service;

import com.ben.controller.HystricErrorCallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "server1" ,fallback = HystricErrorCallback.class)
public interface HystricService {

    @RequestMapping(value = "/hi" ,method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}