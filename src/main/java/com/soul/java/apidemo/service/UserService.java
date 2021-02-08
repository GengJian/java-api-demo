package com.soul.java.apidemo.service;

import com.soul.java.apidemo.entity.User;

import java.util.List;

/*定义接口,类似c中的头文件；服务？中间件？*/
public interface UserService {
    /*添加固定的用户信息*/
    int addUserItem();

    /*获取固定用户信息*/
    User getUserItem();

    /*添加用户信息*/
    int addUserInfo(String username, int password, String phone);

    /*登录时验证用户信息*/
    List<User> queryByUsername(String username);

}


