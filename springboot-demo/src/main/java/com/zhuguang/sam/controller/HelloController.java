package com.zhuguang.sam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 百度腾讯课堂 搜素"烛光学院"请关注我们吧！
 * 需要往期视频斯琪老师：2996372122
 * 课后答疑可以加Sam老师QQ:1696862282
 *   @Controller
 *   @GetMapping("/hello")
 *   @ResponseBody
 * @Auther: Sam
 * @Date: 2020/3/25 10:28
 * @Description:
 */
@RestController
public class HelloController    {
    //http://localhost:8080/hello
    @RequestMapping("/hello")
    public  String hello(){
        return "hello,Spring Boot!";
    }

}
