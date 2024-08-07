package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    User selectById(int id);

    @Select("select email from `user` where name = #{name}")
    User selectByName(String name);
}