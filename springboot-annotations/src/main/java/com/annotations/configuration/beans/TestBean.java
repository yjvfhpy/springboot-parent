package com.annotations.configuration.beans;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liujian@webull.com
 * @date 2019-05-11 23:40
 */
@Slf4j
public class TestBean {
    private String username;
    private String url;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void start() {
        log.info("TestBean 初始化。。。");
    }

    public void cleanUp() {
        log.info("TestBean 销毁。。。");
    }

    public void sayHello() {
        log.info("TestBean sayHello...");
    }
}