package com.xiaoqiu.domain;

//@Time : 2022/2/25 14:47
//@Author : xiaoqiuxx
public class User {
    private Integer id;
    private String name;
    private Integer age;

    //写一个默认的构造函数
    public User(){};

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
