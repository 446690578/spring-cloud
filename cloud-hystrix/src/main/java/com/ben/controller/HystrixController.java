package com.ben.controller;

import com.ben.service.HelloService;
import com.ben.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(name="name" ,defaultValue = "yuan" ,required = false)
                                        String name){
        return  helloService.sayHi(name);
    }


}
