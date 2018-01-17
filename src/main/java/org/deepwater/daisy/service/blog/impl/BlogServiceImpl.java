package org.deepwater.daisy.service.blog.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.common.Tools;
import org.deepwater.daisy.entity.blog.Blog;
import org.deepwater.daisy.mapper.blog.BlogMapper;
import org.deepwater.daisy.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public ReturnValue saveBlog(Blog blog) {
        ReturnValue rtv = new ReturnValue();
        try {
            // 创建博客序列号
            String blogNumber = Tools.CreateID("BL");
            blog.setBlogAuthor("jcxu");
            blog.setBlogNumber(blogNumber);
            int saveBlog = blogMapper.insert(blog);
            // 保存tag中间表
            List<String> tags = blog.getTags();
            rtv.setSuccess(true);
            rtv.setMsg("保存成功");
        } catch ( Exception e) {
            e.printStackTrace();
            rtv.setMsg("保存失败");
        }
        return rtv;
    }

    @Override
    public Blog getBlogDetail(String blogNumber) {
        return blogMapper.selectByBlogNumber(blogNumber);
    }

    @Override
    public Page<Blog> getBlogListByPage(Blog blog) {
        try {
            PageHelper.startPage(blog.getPageNo(), blog.getPageSize());
            return blogMapper.getBlogListByPage(blog);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
