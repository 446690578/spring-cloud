package com.ben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/*
* @Author: Ben.Yuan
* @Description:             端口  8765
* @Date: 上午11:32 2018/10/24
*/

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Feign_Application {

    public static void main(String[] args) {
        SpringApplication.run(Feign_Application.class,args);
    }

}
