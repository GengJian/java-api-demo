package com.soul.java.apidemo.controller;

import com.soul.java.apidemo.entity.User;
import com.soul.java.apidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;
    @RequestMapping(value = "/getUserItem", method = RequestMethod.GET) //暴露给外边的接口
    public String getUserItem(){
        User user = service.getUserInfo() ;
        return user.toString();
    }

}
