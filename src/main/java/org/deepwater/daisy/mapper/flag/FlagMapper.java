package org.deepwater.daisy.mapper.flag;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.deepwater.daisy.entity.flag.Flag;
import org.deepwater.daisy.entity.flag.FlagExample;

import java.util.List;

@Mapper
public interface FlagMapper {
    @SelectProvider(type=FlagSqlProvider.class, method="countByExample")
    long countByExample(FlagExample example);

    @Delete({
        "delete from T_DAISY_BLOG_FLAG",
        "where flag_id = #{flagId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer flagId);

    @Insert({
        "insert into T_DAISY_BLOG_FLAG (flag_id, flag_number, ",
        "flag_name, flag_icon)",
        "values (#{flagId,jdbcType=INTEGER}, #{flagNumber,jdbcType=VARCHAR}, ",
        "#{flagName,jdbcType=VARCHAR}, #{flagIcon,jdbcType=VARCHAR})"
    })
    int insert(Flag record);

    @InsertProvider(type=FlagSqlProvider.class, method="insertSelective")
    int insertSelective(Flag record);

    @Select({
        "select",
        "flag_id, flag_number, flag_name, flag_icon",
        "from T_DAISY_BLOG_FLAG",
        "where flag_id = #{flagId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="flag_id", property="flagId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="flag_number", property="flagNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag_name", property="flagName", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag_icon", property="flagIcon", jdbcType=JdbcType.VARCHAR)
    })
    Flag selectByPrimaryKey(Integer flagId);

    @Select({
            "select",
            "flag_id, flag_number, flag_name, flag_icon",
            "from T_DAISY_BLOG_FLAG"
    })
    @Results({
            @Result(column="flag_id", property="flagId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="flag_number", property="flagNumber", jdbcType=JdbcType.VARCHAR),
            @Result(column="flag_name", property="flagName", jdbcType=JdbcType.VARCHAR),
            @Result(column="flag_icon", property="flagIcon", jdbcType=JdbcType.VARCHAR)
    })
    List<Flag> selectFlagList();

    @UpdateProvider(type=FlagSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Flag record);

    @Update({
        "update T_DAISY_BLOG_FLAG",
        "set flag_number = #{flagNumber,jdbcType=VARCHAR},",
          "flag_name = #{flagName,jdbcType=VARCHAR},",
          "flag_icon = #{flagIcon,jdbcType=VARCHAR}",
        "where flag_id = #{flagId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Flag record);
}