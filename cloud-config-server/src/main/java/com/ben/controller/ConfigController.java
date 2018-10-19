package com.ben.controller;

import com.ben.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConfigController {

    @Autowired
    private ConfigService configService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(required = false) String name){
        return  configService.sayHiFromClientOne(name);
    }


}
