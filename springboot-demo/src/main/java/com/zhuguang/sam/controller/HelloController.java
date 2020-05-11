package com.zhuguang.sam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 *   @Controller
 *   @GetMapping("/hello")
 *   @ResponseBody
 * @Auther: Sam
 * @Date: 2020/3/25 10:28
 * @Description:
 */
@RestController
public class HelloController    {
    @Autowired
    private DataSource dataSource;
    //http://localhost:8080/hello
    @RequestMapping("/hello")
    public  String hello(){
        return "hello,Spring Boot!"+dataSource;
    }

}
