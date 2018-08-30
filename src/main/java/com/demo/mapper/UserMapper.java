package com.demo.mapper;


import java.util.List;

import com.demo.model.User;

public interface UserMapper {

    int insert(User record);

    List<User> selectUsers();
}