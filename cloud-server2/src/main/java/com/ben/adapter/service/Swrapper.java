package com.ben.adapter.service;

public abstract class Swrapper implements Sourceable {

    //覆盖所有的方法
    @Override
    public Object adapterMethod1() {
        return "抽象重写的方法";
    }

    @Override
    public Object normalMethod() {
        return "normalMethod";
    }
}
