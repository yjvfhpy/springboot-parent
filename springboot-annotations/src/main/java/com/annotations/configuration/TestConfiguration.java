package com.annotations.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @Configuration标注在类上，相当于把该类作为spring的xml配置文件中的<beans>，作用为：配置spring容器(应用上下文)
 * 等价于：声明xml文件
 * @author liujian@mical.com
 * @date 2019-05-11 23:29
 */
@Configuration
@Slf4j
public class TestConfiguration {
    public TestConfiguration(){
      log.info("spring容器启动....");
    }
}