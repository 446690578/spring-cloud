package com.ben.controller;

import com.ben.service.HelloService;
import com.ben.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @Resource
    private HelloService helloService;

    /*
    * @Author: Ben.Yuan
    * @Description:             测试结合restPlate负载均衡 需要开多个同名的服务注册到eureka中
    *                           注意：restPlate使用的地址是需要用eureka注册过的service
    *                           url: http://localhost:8766/helloLoadBalance?name=111
    * @Date: 下午5:22 2018/10/24
    */
    @RequestMapping(value = "/helloLoadBalance",method = RequestMethod.GET)
    public String sayHi(@RequestParam(name="name" ,defaultValue = "yuan" ,required = false)
                                        String name){
        return  helloService.sayHi(name);
    }

    /*
    * @Author: Ben.Yuan
    * @Description:             测试hystric断路器，自身报错可以降级处理
    *                           正常url ：http://localhost:8766/helloHystric?name=yuan
    *                           断路url : http://localhost:8766/helloHystric?name=111
    * @Date: 下午5:09 2018/10/24
    */
    @RequestMapping(value = "/helloHystric",method = RequestMethod.GET)
    public String sayHello(@RequestParam(name="name" ,defaultValue = "yuan" ,required = false)
                                String name){
        return  helloService.sayHystric(name);
    }

    /*
    * @Author: Ben.Yuan
    * @Description:              测试feign整合hystric的请求
    *                            启动configserver 服务正常 反之报错
    *                            url : http://localhost:8766/hiFeign?name=111
    * @Date: 下午4:58 2018/10/24
    */
    @GetMapping("/hiFeign")
    public String hiFeign(@RequestParam(name="name" ,defaultValue = "yuan" ,required = false)
                                      String name) {
        return hystrixService.sayHiFromClientOne(name);
    }
}
