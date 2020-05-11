package com.zhuguang.sam.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Auther: Sam
 * @Date: 2020/3/25 11:02
 * @Description:
 */
@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
    /*@Value("${jdbc.url}")
    String url;
    @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;*/
   /* @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
       druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }*/
  /* @Bean
    public DataSource dataSource(JdbcProperties prop){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(prop.getDriverClassName());
        druidDataSource.setUrl(prop.getUrl());
        druidDataSource.setUsername(prop.getUsername());
        druidDataSource.setPassword(prop.getPassword());
        return druidDataSource;
    }*/
   @Bean
   //默认找application.properties里面jdbc前缀开头的配置
   @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        return  new DruidDataSource();
    }
}
