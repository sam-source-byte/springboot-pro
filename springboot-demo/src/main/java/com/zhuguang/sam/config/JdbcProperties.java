package com.zhuguang.sam.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 欢迎大家来我的github地址围观我的商城项目：
 * https://github.com/sam-source-byte
 *
 * @Auther: Sam
 * @Date: 2020/5/11 13:54
 * @Description:
 */
//@ConfigurationProperties(prefix = "jdbc")
//@Data
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
