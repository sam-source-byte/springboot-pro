package com.zhuguang.sam.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Properties;

/**
 * 欢迎大家来我的github地址围观我的商城项目：
 * https://github.com/sam-source-byte
 *
 * @Auther: Sam
 * @Date: 2020/6/18 19:37
 * @Description:
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.zhuguang.sam.mapper")
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return  new PaginationInterceptor();
    }

}
