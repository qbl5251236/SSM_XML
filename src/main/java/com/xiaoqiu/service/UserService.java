package com.xiaoqiu.service;

import com.xiaoqiu.domain.User;

import java.util.List;

//@Time : 2022/2/25 15:00
//@Author : xiaoqiuxx
public interface UserService {
    boolean save(User user);
    boolean remove(Integer id);
    User get(Integer id);
    List<User> list();
}
