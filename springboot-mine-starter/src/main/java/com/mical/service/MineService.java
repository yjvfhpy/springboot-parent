package com.mical.service;

/**
 * @author liujian@mical.com
 * @date 2019-05-11 00:29
 */
public class MineService {
    private String host;
    private String msg;

    public String sayHello() {
        return "HELLO :" + host + "," + msg;
    }


    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }


}