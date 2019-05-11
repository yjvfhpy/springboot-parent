package com.annotations.configuration.scope;

import com.annotations.configuration.beans.TestBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author liujian@webull.com
 * @date 2019-05-11 23:49
 */
@Slf4j
@Configuration
@ComponentScan(basePackages = "com.annotations.configuration.scope")
public class TestConfiguration {
    public TestConfiguration() {
        log.info("TestConfiguration容器启动初始化。。。");
    }

    //@Bean注解注册bean,同时可以指定初始化和销毁方法
    @Bean(name = "testBean", initMethod = "start", destroyMethod = "cleanUp")
    @Scope("prototype")
    public TestBean testBean() {
        return new TestBean();
    }
}