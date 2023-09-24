package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户
     * @param openid
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 添加新用户
     * @param user
     */
    void insert(User user);

    @Select("select * from user where id = #{userId};")
    User getById(Long userId);

    /**
     * 动态统计新增用户数和总用户数
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
