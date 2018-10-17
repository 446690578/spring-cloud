package com.ben;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

@EnableHystrixDashboard //开启断路器面板
@SpringCloudApplication //包括@EnableDiscoveryClient @EnableCircuitBreaker
@EnableTurbine          //
@EnableHystrix
public class Hystrix_Application {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix_Application.class,args);
    }




}
