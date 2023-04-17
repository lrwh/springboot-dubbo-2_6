package com.lr.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.lr.dubbo.api.HierarchyService;
import com.lr.dubbo.api.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0",timeout = 3000)
@Component
public class TestServiceImpl implements TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Reference(version = "1.0.0",timeout = 300)
    private HierarchyService hierarchyService;

    @Override
    public String testDubbo() {
        logger.info("this is testDubbo func,you can do somethings.");
        return "hello ,I'm dubbo provider";
    }

    @Override
    public String doHierarchy() {
//        return "";
        return hierarchyService.hierarchy("tom");
    }
}
