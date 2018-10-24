package com.ben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Zuul_Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_Application.class,args);
    }

}

/*
* @Author: Ben.Yuan
* @Description:端口号  8767
* @Date: 下午4:23 2018/10/23
*/