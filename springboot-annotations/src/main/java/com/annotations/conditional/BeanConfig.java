package com.annotations.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liujian@webull.com
 * @date 2019-05-12 19:45
 */
@Configuration
public class BeanConfig {

    @Bean(name = "bill")
    public Person person1() {
        return new Person("Bill Gates", 62);
    }

    @Bean("linus")
    public Person person2() {
        return new Person("Linus", 48);
    }
}