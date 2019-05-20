package com.annotations.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author liujian@mical.com
 * @date 2019-05-12 20:08
 */
public class ConditionalOsTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanOsConfig.class);
        String osName = applicationContext.getEnvironment().getProperty("os.name");

        System.out.println("当前系统为：" + osName);
        Map<String, Person> map = applicationContext.getBeansOfType(Person.class);
        System.out.println(map);
    }
}