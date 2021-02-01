package com.soul.java.apidemo.mapper;

import com.soul.java.apidemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    int addUserInfo(User user);
}
