package com.ben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class Config_Application {

    public static void main(String[] args) {
        SpringApplication.run(Config_Application.class,args);
    }

}
/*
* @Author: Ben.Yuan
* @Description:
* @param  端口  8771
* @Date: 上午11:41 2018/10/23 
*/


// bootstrap.yml优先于application.yml加载，且不会被本地配置文件覆盖
