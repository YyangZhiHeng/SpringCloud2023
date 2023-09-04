package com.study.eureka_provider.mapper;

import com.study.eureka_provider.pojo.Ordertb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {
    @Select("select * from ordertb where id =#{id}")
    public Ordertb findOrderAllById(int id);
}
