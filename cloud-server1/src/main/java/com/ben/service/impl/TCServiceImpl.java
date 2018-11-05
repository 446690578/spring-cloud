package com.ben.service.impl;

import com.ben.mapper.IStockDao;
import com.ben.service.StockService;
import com.ben.service.TCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("tcService")
public class TCServiceImpl implements TCService {


    @Autowired
    private IStockDao stockDao;

    @Autowired
    private StockService astock;

    @Override
    @Transactional
    public String getTotalMoney(Integer shutdown) {

        /*
        * @Author: Ben.Yuan
        * @Description:             yuan加1 fang减1
        * @Date: 3:42 PM 2018/11/2
        */
        Integer beginyuan = stockDao.getMoney("yuan");
        Integer beginfang = stockDao.getMoney("fang");
        stockDao.updateStockCount("yuan","1","+");
        stockDao.updateStockCount("fang","1","-");
        Integer endyuan = stockDao.getMoney("yuan");
        Integer endfang = stockDao.getMoney("fang");
        Boolean flag = false;
        if (shutdown==1){
            shutdown=1/0;
        }
        astock.updateCount(shutdown);//shutdown==2 此事务中断
        return "转账前："+"beginyuan:"+beginyuan+"  beginfang:" +beginfang + "        "
                +"转账后："+"endYuan" +endyuan  +"  endfang:" +endfang;

    }
}
