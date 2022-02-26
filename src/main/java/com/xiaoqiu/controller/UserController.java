package com.xiaoqiu.controller;

import com.xiaoqiu.domain.User;
import com.xiaoqiu.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@Time : 2022/2/25 15:06
//@Author : xiaoqiuxx
@Controller
@RequestMapping("/Users")
public class UserController implements ApplicationContextAware {
    @Autowired
    private UserService service;

    //读： GET
    //写： Post

    @GetMapping("/list")
    @ResponseBody
    public List<User> list() {
        return service.list();
    }

    @GetMapping("/get")
    @ResponseBody
    public User get(Integer id) {
        return service.get(id);
    }

    @PostMapping("/save")
    @ResponseBody
    public String save(User user) {
        return service.save(user) ? "保存成功" : "保存失败";
    }

    @PostMapping("/remove")
    @ResponseBody
    public String remove(Integer id) {
        return service.remove(id) ? "删除成功" : "删除失败";
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //查看在那个容器
        System.out.println("controller的容器" + applicationContext);
    }
}
