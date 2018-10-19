package com.ben.service.Impl;

import com.ben.service.ConfigService;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "this is config-client";
    }
}
