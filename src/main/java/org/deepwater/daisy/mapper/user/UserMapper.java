package org.deepwater.daisy.mapper.user;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.deepwater.daisy.entity.user.User;
import org.deepwater.daisy.entity.user.UserExample;

@Mapper
public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @Delete({
        "delete from T_DAISY_USER",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
        "insert into T_DAISY_USER (user_id, user_name, ",
        "user_phone, user_password, ",
        "user_createdata, user_avator)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{userPhone,jdbcType=VARCHAR}, #{userPassword,jdbcType=VARCHAR}, ",
        "#{userCreatedata,jdbcType=DATE}, #{userAvator,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "user_id, user_name, user_phone, user_password, user_createdata, user_avator",
        "from T_DAISY_USER",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_createdata", property="userCreatedata", jdbcType=JdbcType.DATE),
        @Result(column="user_avator", property="userAvator", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer userId);

    @Select({
            "select",
            "user_id, user_name, user_phone, user_password, user_createdata, user_avator",
            "from T_DAISY_USER",
            "where user_name = #{userName,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
            @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
            @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
            @Result(column="user_createdata", property="userCreatedata", jdbcType=JdbcType.DATE),
            @Result(column="user_avator", property="userAvator", jdbcType=JdbcType.VARCHAR)
    })
    User selectByUserName(String userName);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update T_DAISY_USER",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "user_phone = #{userPhone,jdbcType=VARCHAR},",
          "user_password = #{userPassword,jdbcType=VARCHAR},",
          "user_createdata = #{userCreatedata,jdbcType=DATE},",
          "user_avator = #{userAvator,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}