package org.deepwater.daisy.service.blog;

import com.github.pagehelper.Page;
import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.entity.blog.Blog;
import org.deepwater.daisy.entity.blog.Image;
import org.deepwater.daisy.entity.flag.Flag;

import java.util.List;

public interface BlogService {

    public ReturnValue saveBlog(Blog blog);

    public Blog getBlogDetail(String blogNumber);

    Page<Blog> getBlogListByPage(Blog blog);

    Page<Image> getImageListByPage(Image image);

    List<Flag> selectFlagList();

    public int saveBlog(Flag flag);

    List<Image> getIndexImage();

    int deleteImage(Integer imageId);

    int addImage(Image image);

    int updateImage(Image image);

    /**
     * AND 语句查询
     *
     * @param blogContent
     * @param blogTitle
     * @return
     */
    List<Blog> findByDescriptionAndScore(String blogContent, String blogTitle);

    /**
     * OR 语句查询
     *
     * @param blogContent
     * @param blogTitle
     * @return
     */
    List<Blog> findByDescriptionOrScore(String blogContent, String blogTitle);

    /**
     * 查询城市描述
     *
     * @param blogContent
     * @return
     */
    List<Blog> findByDescription(String blogContent);

    /**
     * NOT 语句查询
     *
     * @param blogContent
     * @return
     */
    List<Blog> findByDescriptionNot(String blogContent);

    /**
     * LIKE 语句查询
     *
     * @param blogContent
     * @return
     */
    List<Blog> findByDescriptionLike(String blogContent);

    /**
     * 新增博客信息
     *
     * @param blog
     * @return
     */
    Integer addBlog(Blog blog);
}
