package com.zhuguang.sam.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 百度腾讯课堂 搜素"烛光学院"请关注我们吧！
 * 需要往期视频斯琪老师：2996372122
 * 课后答疑可以加Sam老师QQ:1696862282
 *
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
