package com.zhuguang.sam.controller;

import com.zhuguang.sam.pojo.TbUser;
import com.zhuguang.sam.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

/**
 *   @Controller
 *   @GetMapping("/hello")
 *   @ResponseBody
 * @Auther: Sam
 * @Date: 2020/3/25 10:28
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("user")
public class HelloController    {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;
    //http://localhost/user/1
    //@RequestMapping("/hello")
    @GetMapping("{id}")
    public TbUser hello(@PathVariable("id") Long id){
        return userService.queryById(id);
    }

}
