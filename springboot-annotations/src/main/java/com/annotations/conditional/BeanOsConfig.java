package com.annotations.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author liujian@mical.com
 * @date 2019-05-12 20:06
 */

@Configuration
public class BeanOsConfig {


    //只有一个类时，大括号可以省略
    //如果WindowsCondition的实现方法返回true，则注入这个bean
    @Conditional({WindowsCondition.class})
    @Bean(name = "bill")
    public Person person1() {
        return new Person("windows Bill Gates", 62);
    }


    //如果LinuxCondition的实现方法返回true，则注入这个bean
    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person2() {
        return new Person("linux Linus", 48);
    }


    //如果LinuxCondition的实现方法返回true，则注入这个bean
    @Conditional({MacCondition.class})
    @Bean("mac")
    public Person person3() {
        return new Person("mac jobs", 99);
    }


}