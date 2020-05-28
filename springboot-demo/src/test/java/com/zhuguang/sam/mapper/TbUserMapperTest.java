package com.zhuguang.sam.mapper;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.zhuguang.sam.pojo.TbUser;
import com.zhuguang.sam.start.BootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 欢迎大家来我的github地址围观我的商城项目：
 * https://github.com/sam-source-byte
 *
 * @Auther: Sam
 * @Date: 2020/5/27 23:40
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=BootApplication.class)
public class TbUserMapperTest {
    @Autowired
     private  TbUserMapper tbUserMapper;
    @Test
    public void  testQuery(){
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(1L);
        System.out.println("tbUser ="+tbUser);

    }

}