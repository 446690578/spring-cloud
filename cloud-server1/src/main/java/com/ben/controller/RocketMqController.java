package com.ben.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RocketMqController {


    @GetMapping("/test")
    public Object test() throws InterruptedException {

        Thread.sleep(3000);
        Random random = new Random();
        System.out.println("随机数：" + random.nextInt());
        return "server1 is running :" + random.nextInt() ;

    }


}
