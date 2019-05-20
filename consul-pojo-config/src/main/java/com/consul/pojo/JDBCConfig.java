package com.consul.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author mical
 * @date 2019-05-11 14:36
 */
@ConfigurationProperties(prefix = "xjdbc")
public class JDBCConfig {
    private String dbName;
    private String url;
    private String userName;
    private String passWord;

    public String getDbName() {
        return dbName;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }


    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    @Override
    public String toString() {
        return "JDBCConfig{" +
                "dbName='" + dbName + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}