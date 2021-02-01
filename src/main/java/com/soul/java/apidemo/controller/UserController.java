package com.soul.java.apidemo.controller;

import com.soul.java.apidemo.entity.User;
import com.soul.java.apidemo.entity.Response;
import com.soul.java.apidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    /*新增一个 get userInfo 的GET接口*/
    @RequestMapping(value = "getUserItem", method = GET) //暴露给外边的接口
    public String getUserItem(){
        User user = service.getUserInfo() ;
        return user.toString();
    }

    @RequestMapping(value = "addUserInfo",method = GET)
    public Response addUserInfo(){
        service.addUserInfo();
        Response res = new Response();
        res.setMsg("添加成功");
        res.setCode(1);
        return res;
    }

}
