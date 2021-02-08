package com.soul.java.apidemo.service.impl;

import com.soul.java.apidemo.entity.User;
import com.soul.java.apidemo.mapper.UserMapper;
import com.soul.java.apidemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/*实现 服务接口 -> Mapper*/
public class UserServiceImpl implements UserService {
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    final UserMapper userMapper;

    ////////////////  GET 请求//////////////////////////////

    @Override
    public User getUserItem() {
        User user = new User();
        user.setUsername("Jack");
        user.setPassword(123110);

        return user;
    }

    @Override
    public int addUserItem() {
        String username = "Tom";
        int password = 123;
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhone("9999999");

        return userMapper.addUserInfo(user);
    }

    ////////////////  POST 请求//////////////////////////////

    @Override
    public int addUserInfo(String username, int password, String phone) {
        User user = new User(username,password,phone);
        return userMapper.addUserInfo(user);
    }

    @Override
    public List<User> queryByUsername(String username) {
        return userMapper.queryByUsername(username);
    }
}

