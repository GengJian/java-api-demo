package com.soul.java.apidemo.mapper;

import com.soul.java.apidemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper

/*操作数据库的类*/
public interface UserMapper {

    //添加用户信息
    int addUserInfo(User user);

    //获取用户信息
    List<User> queryByUsername(String username);
}
