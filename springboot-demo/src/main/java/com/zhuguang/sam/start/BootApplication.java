package com.zhuguang.sam.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: Sam
 * @Date: 2020/3/25 10:24
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.zhuguang.sam"})
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }
}
