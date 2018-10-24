package com.ben.controller;

import com.ben.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceError implements FeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "这是feign整合hystric请求报错的界面：" + name;
    }
}
