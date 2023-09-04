package com.study.eureka_consumer.mapper;

import com.study.eureka_consumer.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User findUserById(int id);
}
