package org.deepwater.daisy.service.blog;

import com.github.pagehelper.Page;
import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.entity.blog.Blog;

public interface BlogService {

    public ReturnValue saveBlog(Blog blog);

    public Blog getBlogDetail(String blogNumber);

    Page<Blog> getBlogListByPage(Blog blog);
}
