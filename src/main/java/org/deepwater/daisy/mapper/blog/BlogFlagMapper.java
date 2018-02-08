package org.deepwater.daisy.mapper.blog;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.deepwater.daisy.entity.blog.BlogFlag;
import org.deepwater.daisy.entity.blog.BlogFlagExample;

import java.util.List;

@Mapper
public interface BlogFlagMapper {
    @SelectProvider(type=BlogFlagSqlProvider.class, method="countByExample")
    long countByExample(BlogFlagExample example);

    @Delete({
        "delete from T_DAISY_MIDDLE_BLOG_FLAG",
        "where blogflag_id = #{blogflagId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer blogflagId);

    @Insert({
        "insert into T_DAISY_MIDDLE_BLOG_FLAG (blogflag_id, blogflag_blog_number, ",
        "blogflag_flag_number)",
        "values (#{blogflagId,jdbcType=INTEGER}, #{blogflagBlogNumber,jdbcType=VARCHAR}, ",
        "#{blogflagFlagNumber,jdbcType=VARCHAR})"
    })
    int insert(BlogFlag record);

    @InsertProvider(type=BlogFlagSqlProvider.class, method="insertSelective")
    int insertSelective(BlogFlag record);

    @InsertProvider(type = BlogFlagSqlProvider.class, method = "insertAll")
    void insertAll(@Param("list") List<BlogFlag> blogFlags);

    @Select({
        "select",
        "blogflag_id, blogflag_blog_number, blogflag_flag_number",
        "from T_DAISY_MIDDLE_BLOG_FLAG",
        "where blogflag_id = #{blogflagId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="blogflag_id", property="blogflagId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="blogflag_blog_number", property="blogflagBlogNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="blogflag_flag_number", property="blogflagFlagNumber", jdbcType=JdbcType.VARCHAR)
    })
    BlogFlag selectByPrimaryKey(Integer blogflagId);

    @UpdateProvider(type=BlogFlagSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BlogFlag record);

    @Update({
        "update T_DAISY_MIDDLE_BLOG_FLAG",
        "set blogflag_blog_number = #{blogflagBlogNumber,jdbcType=VARCHAR},",
          "blogflag_flag_number = #{blogflagFlagNumber,jdbcType=VARCHAR}",
        "where blogflag_id = #{blogflagId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BlogFlag record);
}