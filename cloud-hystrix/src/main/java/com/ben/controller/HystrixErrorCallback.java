package com.ben.controller;

import com.ben.service.HystrixService;
import org.springframework.stereotype.Component;


@Component
public class HystrixErrorCallback implements HystrixService {


    @Override
    public String sayHiFromClientOne(String name) {
        return "hystrix:  " + name;
    }
}
