package com.ben.service;


public interface StockService {

    Integer getMoney(String name);

    void updateStockCount(String shutdown, String name);

    void updateStockCount1(String shutfang, String fang);

    Boolean updateCount(Integer shutdown);
}
