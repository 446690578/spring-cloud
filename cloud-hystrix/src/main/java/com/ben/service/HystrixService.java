package com.ben.service;

import com.ben.controller.HystrixErrorCallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
* @Author: Ben.Yuan
* @Description:                         feign.hystrix.enabled=true
* @Date: 下午5:35 2018/10/23             feign开启断路器配合FeignClient注解使用
*/
@FeignClient(value = "cloud-hystric" ,fallback = HystrixErrorCallback.class)
public interface HystrixService {

    @RequestMapping(value = "/hi" ,method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}