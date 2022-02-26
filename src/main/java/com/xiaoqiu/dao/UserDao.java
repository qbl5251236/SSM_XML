package com.xiaoqiu.dao;

import com.xiaoqiu.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Time : 2022/2/25 14:49
//@Author : xiaoqiuxx
public interface UserDao {
    boolean save(User user);
    boolean update(User user);
    @Select("select * from user where id = #{id}")
    User get(Integer id);
    @Select("select * from user")
    List<User> list();
    boolean remove(Integer id);
}
