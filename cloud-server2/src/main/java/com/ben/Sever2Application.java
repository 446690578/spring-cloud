package com.ben;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableCircuitBreaker  //8763
public class Sever2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sever2Application.class,args);
    }
    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    public String home(@RequestParam(value = "name",required = false,defaultValue = "yuan")
                                   String name) {
        return "hi "+name+",i am server2 from port:" +port;
    }


}
