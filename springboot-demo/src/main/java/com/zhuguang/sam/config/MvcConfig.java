package com.zhuguang.sam.config;

import com.zhuguang.sam.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 欢迎大家来我的github地址围观我的商城项目：
 * https://github.com/sam-source-byte
 *
 * @Auther: Sam
 * @Date: 2020/5/17 07:00
 * @Description:
 */
@Configuration
public class MvcConfig  implements WebMvcConfigurer {
    /**
     * 通过@Bean注解，将我们定义的拦截器注册到Spring容器
     * @return
     */
    @Bean
    public LoginInterceptor registerLoginInterceptor(){
        return  new LoginInterceptor();
    }
    /**
     * 重写接口中的addInterceptors方法，添加自定义拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //通过registry注册拦截器，通过addPathPatterns来添加拦截路径
        registry.addInterceptor(this.registerLoginInterceptor()).addPathPatterns("/**");
    }
}
