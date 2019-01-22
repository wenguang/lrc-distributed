package com.dvs.dubbo.provider.impl;

import com.dvs.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String getDescription() {
        return "demo description";
    }
}
