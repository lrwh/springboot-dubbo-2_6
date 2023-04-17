package com.lr.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lr.dubbo.api.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientController {

    @Reference(version = "1.0.0",timeout = 300)
    private TestService testService;

    @GetMapping("/index")
    public String index(){
        String result = testService.testDubbo();
        return "success : "+result;
    }
    @GetMapping("/hierarchy")
    public String hierarchy(){
        String result = testService.doHierarchy();
        return "hierarchy success : "+result;
    }
}
