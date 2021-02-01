package com.soul.java.apidemo.service;

import com.soul.java.apidemo.entity.User;

/*定义接口,类似c中的头文件*/
public interface UserService {
    /*获取固定用户信息*/
    User getUserInfo();

    /*注册（添加用户信息）*/
    void addUserInfo();
}


