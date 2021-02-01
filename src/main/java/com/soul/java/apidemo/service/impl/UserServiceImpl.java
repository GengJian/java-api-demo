package com.soul.java.apidemo.service.impl;
import com.soul.java.apidemo.entity.User;
import com.soul.java.apidemo.mapper.UserMapper;
import com.soul.java.apidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserInfo() {
        User user = new User();
        user.setUsername("Jack");
        user.setPassword(123110);
        final User user1 = user;

        return user1;
    }

    @Autowired
    UserMapper userMapper;
    public void addUserInfo() {
        String username = "Tom";
        int password = 123;
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        userMapper.addUserInfo(user);
    }
}

