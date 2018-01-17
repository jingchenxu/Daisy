package org.deepwater.daisy.controller.blog;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.entity.blog.Blog;
import org.deepwater.daisy.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/saveBlog", method = RequestMethod.POST)
    @ResponseBody
    public ReturnValue saveBlog(@RequestBody Blog blog) {
        System.out.println(blog);
        return  blogService.saveBlog(blog);
    }

    @RequestMapping(value = "/getBlogListByPage", method = RequestMethod.GET)
    public ReturnValue getBlogListByPage() {
        ReturnValue rtv = new ReturnValue();
        Blog blog = new Blog();
        blog.setPageNo(1);
        blog.setPageSize(10);
        Page<Blog> blogs = blogService.getBlogListByPage(blog);
        PageInfo<Blog> pageInfo = new PageInfo<>(blogs);
        rtv.setSuccess(true);
        rtv.setData(pageInfo);
        return rtv;
    }

}
