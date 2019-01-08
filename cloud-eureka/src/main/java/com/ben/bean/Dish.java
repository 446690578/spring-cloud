package com.ben.bean;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Dish {

    private String name;           //菜名
    private Boolean exist;         //是否在售
    private Integer count;         //数量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Dish(String name, Boolean exist, Integer count) {
        this.name = name;
        this.exist = exist;
        this.count = count;
    }
}
