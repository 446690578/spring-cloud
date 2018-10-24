package com.ben.service;

import com.ben.controller.FeignServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/*
* @Author: Ben.Yuan
* @Description:             当访问sayHiFromClientOne方法时，会自动请求 cloud-Serve的hi方法
*                           易错点：@FeignClient(value = "cloud-Serve" ) 的value值长度太长会报错
* @Date: 上午11:41 2018/10/24
*/
@FeignClient(value = "cloudServe",fallback = FeignServiceError.class)
public interface FeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
