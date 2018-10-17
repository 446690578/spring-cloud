package com.ben.service.impl;

import com.ben.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {

        return "hello :" + name;
    }
}
