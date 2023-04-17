package com.lr.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lr.dubbo.api.HierarchyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0",timeout = 3000)
@Component
public class HierarchyServiceImpl implements HierarchyService {
    private static final Logger logger = LoggerFactory.getLogger(HierarchyServiceImpl.class);
    @Override
    public String hierarchy(String username) {
        logger.info("hierarchy,username:{}",username);
        return "provider2: username:"+username;
    }
}
