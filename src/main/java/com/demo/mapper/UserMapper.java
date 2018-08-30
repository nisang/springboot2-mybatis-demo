package com.demo.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.demo.model.User;

public interface UserMapper {

	@Insert({"INSERT INTO t_user(userId,userName,password,phone) values(#{userId, jdbcType=INTEGER},#{userName, jdbcType=VARCHAR},#{password, jdbcType=VARCHAR},#{phone, jdbcType=VARCHAR})"})
    int insert(User record);

    @Select({
        "select",
        "userId, userName, password, phone",
        "from t_user",
    })
    @Results({
        @Result(column="userId", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userName", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectUsers();
}