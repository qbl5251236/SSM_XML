package com.xiaoqiu.service.impl;

import com.xiaoqiu.dao.UserDao;
import com.xiaoqiu.domain.User;
import com.xiaoqiu.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;

//@Time : 2022/2/25 15:02
//@Author : xiaoqiuxx

@Service
public class UserServiceImpl implements UserService, ApplicationContextAware {
    @Autowired
    private UserDao dao;

    public boolean save(User user) {
        Integer id = user.getId();
        System.out.println(id);
        if (id == null || id < 1) {
            return dao.save(user);
        }
        return dao.update(user);
    }

    public boolean remove(Integer id) {
        return dao.remove(id);
    }

    public User get(Integer id) {
        return dao.get(id);
    }

    public List<User> list() {
        return dao.list();
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("service的容器" + applicationContext);
    }
}
