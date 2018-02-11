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
}
