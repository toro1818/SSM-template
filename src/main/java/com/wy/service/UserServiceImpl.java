package com.wy.service;

import com.wy.dao.UserMapper;
import com.wy.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> selectUsers() {
        return userMapper.selectUsers();
    }


}
