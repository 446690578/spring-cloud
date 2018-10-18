package com.ben.adapter.service.Impl;

import com.ben.adapter.service.Sourceable;
import org.springframework.stereotype.Service;

@Service("sourceable")
public class SourceableImpl implements Sourceable {
    @Override
    public Object adapterMethod1() {

        return "原来的接口";
    }

    @Override
    public Object normalMethod() {

        return "this is normalMethod";
    }
}
