package com.ben.service.impl;

import com.ben.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    private Integer count = 1;

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    private RestTemplate restTemplate;

    @Override
    public String sayHi(String name) {

        String result = restTemplate.getForObject("http://114.55.105.65:8086/v9/showNewConfig?code=8seconds&language=ZH-CN",String.class);
        return "这是一个正常请求的结果 :" + result ;


    }

    @Override
    @HystrixCommand(fallbackMethod = "sayHystricError")
    public String sayHystric(String name) {

        if (!name.equals("yuan")) {
            int i =1/0;
        }
        return "这是一个正常请求的结果 :" + name;


    }

    public String sayHystricError(String name) {

        return "断路器发生作用了 :" + name;


    }



}
