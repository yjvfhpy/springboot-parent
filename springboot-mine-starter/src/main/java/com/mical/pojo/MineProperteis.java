package com.mical.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liujian@mical.com
 * @date 2019-05-11 00:24
 */


// @ConfigurationProperties：用来标识这个pojo是一个用来接收指定前缀的资源配置
// prefix：表示在配置文件中配置项前缀

@ConfigurationProperties(prefix = "mine")
public class MineProperteis {
    private String msg;
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}