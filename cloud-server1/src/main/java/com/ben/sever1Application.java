package com.ben;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import io.sentry.Sentry;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableCircuitBreaker  //开启断路器
@EnableTransactionManagement
@MapperScan(basePackages = "com.ben")
public class sever1Application {
    //端口为8762
    public static void main(String[] args) {
//        Sentry.init("http://5dec3cccc51c48de855a71273f3fd876@101.132.186.125:9000//2");
//        Sentry.init("http://6741f4ce1e5c4c6fb5e01fce6508e4b9@114.55.105.65:9000//2");
        Sentry.init("http://5dec3cccc51c48de855a71273f3fd876@101.132.186.125:9000/2");


        SpringApplication.run(sever1Application.class,args);
    }


    @Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String home(@RequestParam(value = "name",required = false,defaultValue = "yuan")
                                   String name) {
        try{
            Integer  a = 1/0;
        }catch (Exception e){
            Sentry.capture(e);
        }
        return "hi "+name+",i am server1 from port:" +port;
    }


    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiManError")//fallbackMethod方法必须要与原方法参数相同，否则会报错
    public String hiMan(@RequestParam(value = "name",required = false,defaultValue = "yuan")
                               String name) {
        Integer  a = 1/0;
        return "hi "+name+",i am server1 from port:" +port;
    }


    public String hiManError(String name){
        return "error message" + name;
    }






}
