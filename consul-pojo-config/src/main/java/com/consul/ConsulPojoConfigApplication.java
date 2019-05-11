package com.consul;

import com.consul.pojo.JDBCConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({JDBCConfig.class})
public class ConsulPojoConfigApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsulPojoConfigApplication.class, args);
    }

}
