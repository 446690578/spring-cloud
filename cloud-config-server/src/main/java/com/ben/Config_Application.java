package com.ben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class Config_Application {

    public static void main(String[] args) {
        SpringApplication.run(Config_Application.class,args);
    }

}
/*
* @Author: Ben.Yuan
* @Description:
* @param  端口  8770
* @Date: 上午11:31 2018/10/23 
*/