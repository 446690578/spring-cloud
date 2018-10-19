package com.ben.service.impl;

import com.ben.service.ConfigService;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi i am config program";
    }
}
