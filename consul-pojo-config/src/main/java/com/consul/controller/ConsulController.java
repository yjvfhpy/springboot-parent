package com.consul.controller;

import com.consul.pojo.JDBCConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujian@webull.com
 * @date 2019-05-11 13:36
 */

@RestController
public class ConsulController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private JDBCConfig jdbcConfig;

    @Value("${myconfig}")
    private String myconfig;

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        System.out.println(jdbcConfig);

        return discoveryClient.getServices();
    }

    @RequestMapping("/home")
    public String home() {
        System.out.println(22);
        return "Hello World";
    }
}