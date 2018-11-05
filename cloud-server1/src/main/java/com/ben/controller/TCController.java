package com.ben.controller;

import com.ben.service.StockService;
import com.ben.service.TCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController//事物测试控制器
@Transactional
public class TCController {


    @Resource
    private StockService astock;

    @Autowired
    private TCService tcService;

    /*
    * @Author: Ben.Yuan
    * @Description:     http://localhost:8762/NO?shutfang=1
    *                   不加请求参数自动跑，加请求参数shutfang，shutyuan 会让对应的事物发生异常
    * @Date: 1:04 PM 2018/11/2
    */
    @GetMapping("/NO")
    public Object getMoney(@RequestParam( value = "shutyuan",required = false,defaultValue = "0") String shutyuan,
                           @RequestParam( value = "shutfang",required = false,defaultValue = "0") String shutfang){

        Integer beginyuan = astock.getMoney("yuan");
        Integer beginfang = astock.getMoney("fang");
        astock.updateStockCount(shutyuan,"yuan");
        astock.updateStockCount1(shutfang,"fang");
        Integer endyuan = astock.getMoney("yuan");
        Integer endfang = astock.getMoney("fang");
        if (shutyuan.equals("2")){
            int a = 10/0;
        }

        return "转账前："+"beginyuan:"+beginyuan+ "--"+"beginfang:" +beginfang + "----------"
              +"转账后："+"endYuan" +endyuan+ "--"+ "endfang:" +endfang;

    }


    @GetMapping("/TC")
    public Object getTotalMoney(@RequestParam(value = "shutdown",required = false,defaultValue = "0") Integer shutdown){

        String map = tcService.getTotalMoney(shutdown);

        return map;

    }






}
