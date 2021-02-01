package com.soul.java.apidemo.service.impl;
import com.soul.java.apidemo.entity.User;
import com.soul.java.apidemo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserInfo() {
        User user = new User();
        user.setName("jack");
        user.setPassword(123110);
        return user;
    }
}

