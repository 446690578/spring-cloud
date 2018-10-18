package com.ben.adapter;

import com.ben.adapter.service.Sourceable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AdapterController {

    @Resource
    private Sourceable sourceable;

    @Resource
    private Sourceable swrapper;

    //适配前的接口
    @GetMapping("/old")
    public Object test() {
        return sourceable.adapterMethod1();
    }
    //适配后的接口
    @GetMapping("/wrapper")
    public Object wrapper() {
        return swrapper.adapterMethod1();
    }


}





