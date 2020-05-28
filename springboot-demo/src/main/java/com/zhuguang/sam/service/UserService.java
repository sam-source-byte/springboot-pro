package com.zhuguang.sam.service;

import com.zhuguang.sam.mapper.TbUserMapper;
import com.zhuguang.sam.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 欢迎大家来我的github地址围观我的商城项目：
 * https://github.com/sam-source-byte
 *
 * @Auther: Sam
 * @Date: 2020/5/27 21:44
 * @Description:
 */
@Service
public class UserService {
   @Autowired
    private TbUserMapper tbUserMapper;
    public TbUser queryById(Long id){
        return this.tbUserMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void insertTbUser(TbUser user){
        this.tbUserMapper.insert(user);
    }
}
