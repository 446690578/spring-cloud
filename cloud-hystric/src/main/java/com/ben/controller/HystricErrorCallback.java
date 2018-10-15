package com.ben.controller;

import com.ben.service.HystricService;
import org.springframework.stereotype.Component;


@Component
public class HystricErrorCallback implements HystricService {


    @Override
    public String sayHiFromClientOne(String name) {
        return "error  " + name;
    }
}
