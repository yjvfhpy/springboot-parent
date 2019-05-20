package com.annotations.configuration.scope;

import com.annotations.configuration.beans.TestBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujian@mical.com
 * @date 2019-05-11 23:52
 */

@Slf4j
public class TestMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);

        TestBean tb = (TestBean) context.getBean("testBean");
        tb.sayHello();
        System.out.println(tb);

        TestBean tb2 = (TestBean) context.getBean("testBean");
        tb2.sayHello();
        System.out.println(tb2);
    }
}