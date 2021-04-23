package com.dtwave.dao.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * @author : luohong
 * @desc :
 * @since : 2021/4/23 / 上午10:08
 */


@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private ApplicationArguments applicationArguments;

    @GetMapping("/argus")
    public Object argusHello(){
        RuntimeMXBean mxBean = ManagementFactory.getRuntimeMXBean();
        return mxBean.getInputArguments();

        // return System.getProperties();
        // return System.getenv();
    }

    @GetMapping("/test")
    public String test(){
        return "test api is ok...";
    }

}
