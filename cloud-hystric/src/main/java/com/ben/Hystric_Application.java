package com.ben;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableHystrixDashboard
@SpringCloudApplication
@EnableTurbine
@EnableHystrix
public class Hystric_Application {

    public static void main(String[] args) {
        SpringApplication.run(Hystric_Application.class,args);
    }

}
