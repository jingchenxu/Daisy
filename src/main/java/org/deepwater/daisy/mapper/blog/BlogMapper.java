package org.deepwater.daisy.mapper.blog;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.deepwater.daisy.entity.blog.Blog;
import org.deepwater.daisy.entity.blog.BlogExample;

@Mapper
public interface BlogMapper {
    @SelectProvider(type=BlogSqlProvider.class, method="countByExample")
    long countByExample(BlogExample example);

    @Delete({
            "delete from T_DAISY_BLOG",
            "where blog_id = #{blogId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer blogId);

    @Insert({
            "insert into T_DAISY_BLOG (blog_id, blog_title, ",
            "blog_author, blog_publishtime, ",
            "blog_bannerurl, blog_introduction, ",
            "blog_status, blog_type, ",
            "blog_subtitle, blog_number, ",
            "blog_content)",
            "values (#{blogId,jdbcType=INTEGER}, #{blogTitle,jdbcType=VARCHAR}, ",
            "#{blogAuthor,jdbcType=VARCHAR}, #{blogPublishtime,jdbcType=DATE}, ",
            "#{blogBannerurl,jdbcType=VARCHAR}, #{blogIntroduction,jdbcType=VARCHAR}, ",
            "#{blogStatus,jdbcType=VARCHAR}, #{blogType,jdbcType=VARCHAR}, ",
            "#{blogSubtitle,jdbcType=VARCHAR}, #{blogNumber,jdbcType=VARCHAR}, ",
            "#{blogContent,jdbcType=LONGVARCHAR})"
    })
    int insert(Blog record);

    @InsertProvider(type=BlogSqlProvider.class, method="insertSelective")
    int insertSelective(Blog record);

    @Select({
            "select",
            "blog_id, blog_title, blog_author, blog_publishtime, blog_bannerurl, blog_introduction, ",
            "blog_status, blog_type, blog_subtitle, blog_number, blog_content",
            "from T_DAISY_BLOG",
            "where blog_id = #{blogId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="blog_id", property="blogId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="blog_title", property="blogTitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_author", property="blogAuthor", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_publishtime", property="blogPublishtime", jdbcType=JdbcType.DATE),
            @Result(column="blog_bannerurl", property="blogBannerurl", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_introduction", property="blogIntroduction", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_status", property="blogStatus", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_type", property="blogType", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_subtitle", property="blogSubtitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_number", property="blogNumber", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_content", property="blogContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    Blog selectByPrimaryKey(Integer blogId);

    @Select({
            "select",
            "blog_id, blog_title, blog_author, blog_publishtime, blog_bannerurl, blog_introduction, ",
            "blog_status, blog_type, blog_subtitle, blog_number, blog_content",
            "from T_DAISY_BLOG",
            "where blog_number = #{blogNumber,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="blog_id", property="blogId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="blog_title", property="blogTitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_author", property="blogAuthor", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_publishtime", property="blogPublishtime", jdbcType=JdbcType.DATE),
            @Result(column="blog_bannerurl", property="blogBannerurl", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_introduction", property="blogIntroduction", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_status", property="blogStatus", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_type", property="blogType", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_subtitle", property="blogSubtitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_number", property="blogNumber", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_content", property="blogContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    Blog selectByBlogNumber(String blogNumber);

    // 参考：http://blog.csdn.net/qq_32786873/article/details/78297551
    @Select({
            "<script>",
                    "select",
                    "*",
                    "from T_DAISY_BLOG WHERE TRUE",
                    "<if test='blogType != null'>",
                    "AND blog_type LIKE '%${blogType}%'",
                    "</if>",
                    "<if test='blogTitle != null'>",
                    "AND blog_title LIKE '%${blogTitle}%'",
                    "</if>",
                    "<if test='blogStatus != null'>",
                    "AND blog_status LIKE '%${blogStatus}%'",
                    "</if>",
                    "ORDER BY blog_publishtime DESC",
                    "</script>"
    })
    @Results({
            @Result(column="blog_id", property="blogId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="blog_title", property="blogTitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_author", property="blogAuthor", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_publishtime", property="blogPublishtime", jdbcType=JdbcType.DATE),
            @Result(column="blog_bannerurl", property="blogBannerurl", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_introduction", property="blogIntroduction", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_status", property="blogStatus", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_type", property="blogType", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_subtitle", property="blogSubtitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="blog_number", property="blogNumber", jdbcType=JdbcType.VARCHAR),
            //@Result(column="blog_content", property="blogContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    Page<Blog> getBlogListByPage(Blog blog);

    @UpdateProvider(type=BlogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Blog record);

    @Update({
            "update T_DAISY_BLOG",
            "set blog_title = #{blogTitle,jdbcType=VARCHAR},",
            "blog_author = #{blogAuthor,jdbcType=VARCHAR},",
            "blog_publishtime = #{blogPublishtime,jdbcType=DATE},",
            "blog_bannerurl = #{blogBannerurl,jdbcType=VARCHAR},",
            "blog_introduction = #{blogIntroduction,jdbcType=VARCHAR},",
            "blog_status = #{blogStatus,jdbcType=VARCHAR},",
            "blog_type = #{blogType,jdbcType=VARCHAR},",
            "blog_subtitle = #{blogSubtitle,jdbcType=VARCHAR},",
            "blog_number = #{blogNumber,jdbcType=VARCHAR},",
            "blog_content = #{blogContent,jdbcType=LONGVARCHAR}",
            "where blog_id = #{blogId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Blog record);

    @Update({
            "update T_DAISY_BLOG",
            "set blog_title = #{blogTitle,jdbcType=VARCHAR},",
            "blog_author = #{blogAuthor,jdbcType=VARCHAR},",
            "blog_publishtime = #{blogPublishtime,jdbcType=DATE},",
            "blog_bannerurl = #{blogBannerurl,jdbcType=VARCHAR},",
            "blog_introduction = #{blogIntroduction,jdbcType=VARCHAR},",
            "blog_status = #{blogStatus,jdbcType=VARCHAR},",
            "blog_type = #{blogType,jdbcType=VARCHAR},",
            "blog_subtitle = #{blogSubtitle,jdbcType=VARCHAR},",
            "blog_number = #{blogNumber,jdbcType=VARCHAR}",
            "where blog_id = #{blogId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Blog record);
}