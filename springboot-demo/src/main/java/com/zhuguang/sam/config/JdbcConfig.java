package com.zhuguang.sam.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 百度腾讯课堂 搜素"烛光学院"请关注我们吧！
 * 需要往期视频斯琪老师：2996372122
 * 课后答疑可以加Sam老师QQ:1696862282
 *
 * @Auther: Sam
 * @Date: 2020/3/25 11:02
 * @Description:
 */
@Configuration
public class JdbcConfig {
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
      /*  druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);*/
        return druidDataSource;
    }
}
