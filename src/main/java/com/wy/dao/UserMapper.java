package com.wy.dao;

import com.wy.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUsers();

}
