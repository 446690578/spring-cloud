package com.ben.service.impl;

import com.ben.mapper.IStockDao;
import com.ben.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("astock")

public class StockServiceImpl implements StockService {

    @Autowired
    private IStockDao stockDao;


    @Override
    public Integer getMoney(String name) {
        Integer money = stockDao.getMoney(name);
        return money;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void updateStockCount(String shutdown, String name) {

        if (shutdown.equals("1")){
            int a = 10/0;
        }
        String symbol = "-";
        if (name.equals("yuan")) {
            symbol = "+";
        }
        stockDao.updateStockCount(name, "1", symbol);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void updateStockCount1(String shutdown, String name) {
        try{
            if (shutdown.equals("1")){
                int a = 10/0;
            }
        }catch (Exception e){
            System.out.println("异常");
        }


        String symbol = "-";
        if (name.equals("yuan")) {
            symbol = "+";
        }
        stockDao.updateStockCount(name, "1", symbol);
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Boolean updateCount(Integer shutdown) {
//        try {
//            if (shutdown == 2){
//                int a = 1/0;
//            }
//        }catch (Exception e){
//            System.out.println("ssssssss");
//        }
        if (shutdown == 2){
            int a = 1/0;
        }
        stockDao.updateCount();
        return true;
    }
}
