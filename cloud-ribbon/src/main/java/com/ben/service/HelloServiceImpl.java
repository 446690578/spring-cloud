package com.ben.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service("helloService")
public class HelloServiceImpl {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Resource
     RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://server1/hi?name=" + name,String.class);
    }

}
