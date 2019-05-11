package com.webull.config;

import com.webull.pojo.MineProperteis;
import com.webull.service.MineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sound.midi.Soundbank;

/**
 * @author liujian@webull.com
 * @date 2019-05-11 00:32
 *
 * @Configuration：标识此类为一个spring配置类
 * @EnableConfigurationProperties(value = HelloServiceProperteis.class):启动配置文件，value用来指定我们要启用的配置类，可以有多个，多个时我们可以这么写value={xxProperties1.class,xxProperteis2.class....}
 * @ConditionalOnClass(HelloService.class):表示当classPath下存在HelloService.class文件时改配置文件类才有效
 * @ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true):表示只有我们的配置文件是否配置了以hello为前缀的资源项值，并且在该资源项值为enable，如果没有配置我们默认设置为enable
 *
 */


@Configuration
@EnableConfigurationProperties(value = MineProperteis.class)
@ConditionalOnClass(MineService.class)
@ConditionalOnProperty(prefix = "mine", value = "enable", matchIfMissing = true)
public class MineAutoConfiguration {

    @Autowired
    private MineProperteis mineProperteis;


    @Bean
    @ConditionalOnMissingBean(MineService.class)
    public MineService getService(){
        System.out.println("init begin....");
        MineService mineService = new MineService();
        mineService.setMsg(mineProperteis.getMsg());
        mineService.setHost(mineProperteis.getHost());
        return mineService;
    }

}