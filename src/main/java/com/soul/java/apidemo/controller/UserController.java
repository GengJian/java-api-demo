package com.soul.java.apidemo.controller;

import com.soul.java.apidemo.entity.Response;
import com.soul.java.apidemo.entity.User;
import com.soul.java.apidemo.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
/*应用层，在此控制器中调用相关服务并处理逻辑*/
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    //[POST]注册接口
    @RequestMapping(value = "/register", method = POST)
    public Response register(@RequestBody Map<String, String> person){
        String username = person.get("username");
        int password = Integer.parseInt(person.get("password"));
        String phone = person.get("phone");

        System.out.println(username+password+phone);

        //1.判断用户名 & 密码 & 手机号 是否为空
        if (username != null && password != 0 && phone != null){
            List<User> users = service.queryUserByPhone(phone);
            //2.判断是否已有重复手机号
            if (users != null && users.size()>0){
                return new Response(true, "注册失败，用户名重复", -1);
            } else {
                int count = service.addUserInfo(username,password,phone);
                if(count>0){
                    //3.没有重复用户名，注册成功
                    return new Response(true,"注册成功",0);
                }else {
                    return new Response(true,"注册失败",-2);
                }
            }
        } else {
            return new Response(true,"注册失败，请检查用户名、密码、手机号是否为空",-3);
        }
    }

    //[POST]登陆接口
    @RequestMapping(value = "/login", method = POST)
    public Response login(@RequestBody Map<String, String> person) {
        String username = person.get("username");
        int password =Integer.parseInt(person.get("password"));
        //1. 判断用户名、密码是否为空
        if(username != null && password != 0 ){
            List<User> users =  service.queryByUsername(username);
            //2. 判断用户名是否存在
            if(users!=null && users.size()>0){
                User user = users.get(0);
                //3. 判断密码是否正确
                if(password == user.getPassword()){
                    //4. 密码正确，登陆成功
                    return new Response(true,"登陆成功",1);
                } else {
                    return new Response(false,"登陆失败，密码错误",-1);
                }
            } else {
                return new Response(true,"登陆失败，用户名不存在",-1);
            }
        } else {
            return new Response(true,"登陆失败，请检查用户名、密码是否为空",-1);
        }
    }

    //[GET] 模拟一个获取固定用户信息的 getUserItem
    @RequestMapping(value = "/getUserItem", method = GET) //暴露给外边的接口
    public String getUserItem(){
        User user = service.getUserItem() ;
        return user.toString();
    }

    // [GET] 模拟添加一个固定用户信息
    @RequestMapping(value = "/addUserItem", method = GET)
    public void addUserItem(){
        service.addUserItem();
    }

}
