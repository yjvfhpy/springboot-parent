package com.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujian@mical.com
 * @date 2019-05-11 13:36
 */

@RestController
public class ConsulController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${mical.chinese.name}")
    private String mysql_host;


    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        System.out.println("简单的单个参数配置值：" + mysql_host);

        return discoveryClient.getServices();
    }

    @RequestMapping("/get")
    public String get() {
        return mysql_host;
    }
}