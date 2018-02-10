package org.deepwater.daisy.mapper.blog;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.deepwater.daisy.entity.blog.Image;
import org.deepwater.daisy.entity.blog.ImageExample;

import java.util.List;

@Mapper
public interface ImageMapper {
    @SelectProvider(type=ImageSqlProvider.class, method="countByExample")
    long countByExample(ImageExample example);

    @Delete({
        "delete from T_DAISY_IMAGE",
        "where image_id = #{imageId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer imageId);

    @Insert({
        "insert into T_DAISY_IMAGE (image_id, image_number, ",
        "image_name, image_url, ",
        "image_is_index, image_description, ",
        "image_is_remote, image_createtime, ",
        "image_creator, image_type)",
        "values (#{imageId,jdbcType=INTEGER}, #{imageNumber,jdbcType=VARCHAR}, ",
        "#{imageName,jdbcType=VARCHAR}, #{imageUrl,jdbcType=VARCHAR}, ",
        "#{imageIsIndex,jdbcType=BIT}, #{imageDescription,jdbcType=VARCHAR}, ",
        "#{imageIsRemote,jdbcType=BIT}, #{imageCreatetime,jdbcType=DATE}, ",
        "#{imageCreator,jdbcType=VARCHAR}, #{imageType,jdbcType=VARCHAR})"
    })
    int insert(Image record);

    @InsertProvider(type=ImageSqlProvider.class, method="insertSelective")
    int insertSelective(Image record);

    @Select({
        "select",
        "image_id, image_number, image_name, image_url, image_is_index, image_description, ",
        "image_is_remote, image_createtime, image_creator, image_type",
        "from T_DAISY_IMAGE",
        "where image_id = #{imageId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="image_id", property="imageId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="image_number", property="imageNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_name", property="imageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_is_index", property="imageIsIndex", jdbcType=JdbcType.BIT),
        @Result(column="image_description", property="imageDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_is_remote", property="imageIsRemote", jdbcType=JdbcType.BIT),
        @Result(column="image_createtime", property="imageCreatetime", jdbcType=JdbcType.DATE),
        @Result(column="image_creator", property="imageCreator", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_type", property="imageType", jdbcType=JdbcType.VARCHAR)
    })
    Image selectByPrimaryKey(Integer imageId);

    @Select({
            "select",
            "image_id, image_number, image_name, image_url, image_is_index, image_description, ",
            "image_is_remote, image_createtime, image_creator, image_type",
            "from T_DAISY_IMAGE",
            "where image_is_index = 1"
    })
    @Results({
            @Result(column="image_id", property="imageId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="image_number", property="imageNumber", jdbcType=JdbcType.VARCHAR),
            @Result(column="image_name", property="imageName", jdbcType=JdbcType.VARCHAR),
            @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
            @Result(column="image_is_index", property="imageIsIndex", jdbcType=JdbcType.BIT),
            @Result(column="image_description", property="imageDescription", jdbcType=JdbcType.VARCHAR),
            @Result(column="image_is_remote", property="imageIsRemote", jdbcType=JdbcType.BIT),
            @Result(column="image_createtime", property="imageCreatetime", jdbcType=JdbcType.DATE),
            @Result(column="image_creator", property="imageCreator", jdbcType=JdbcType.VARCHAR),
            @Result(column="image_type", property="imageType", jdbcType=JdbcType.VARCHAR)
    })
    List<Image> getIndexImage();

    @UpdateProvider(type=ImageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Image record);

    @Update({
        "update T_DAISY_IMAGE",
        "set image_number = #{imageNumber,jdbcType=VARCHAR},",
          "image_name = #{imageName,jdbcType=VARCHAR},",
          "image_url = #{imageUrl,jdbcType=VARCHAR},",
          "image_is_index = #{imageIsIndex,jdbcType=BIT},",
          "image_description = #{imageDescription,jdbcType=VARCHAR},",
          "image_is_remote = #{imageIsRemote,jdbcType=BIT},",
          "image_createtime = #{imageCreatetime,jdbcType=DATE},",
          "image_creator = #{imageCreator,jdbcType=VARCHAR},",
          "image_type = #{imageType,jdbcType=VARCHAR}",
        "where image_id = #{imageId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Image record);
}