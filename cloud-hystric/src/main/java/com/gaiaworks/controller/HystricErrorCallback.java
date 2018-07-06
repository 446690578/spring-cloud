package com.gaiaworks.controller;

import com.gaiaworks.service.HystricService;
import org.springframework.stereotype.Component;


@Component
public class HystricErrorCallback implements HystricService {


    @Override
    public String sayHiFromClientOne(String name) {
        return "error  " + name;
    }
}
