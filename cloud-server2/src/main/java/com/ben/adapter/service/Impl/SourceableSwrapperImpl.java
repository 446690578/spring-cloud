package com.ben.adapter.service.Impl;

import com.ben.adapter.service.Swrapper;
import org.springframework.stereotype.Service;

@Service("swrapper")
public class SourceableSwrapperImpl extends Swrapper {


    @Override
    public Object adapterMethod1() {
        return super.adapterMethod1() + "swrapper";
    }
}
