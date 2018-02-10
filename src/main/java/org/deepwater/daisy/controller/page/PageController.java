package org.deepwater.daisy.controller.page;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.deepwater.daisy.entity.blog.Blog;
import org.deepwater.daisy.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class PageController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/")
    public String defaultdo(Map<String, Object> map) {
        map.put("name", "jingchenxu");
        Blog blog = new Blog();
        blog.setPageNo(1);
        blog.setPageSize(9);
        Page<Blog> blogs = blogService.getBlogListByPage(blog);
        PageInfo<Blog> pageInfo = new PageInfo<>(blogs);
        //System.out.println(blogService.getIndexImage());
        map.put("indexImage", blogService.getIndexImage());
        map.put("pageInfo", pageInfo);
        return "index";
    }

    @RequestMapping("/index")
    public String index(@RequestParam(value = "pageNo", required = false) Integer pageNo, Map<String, Object> map) {
        System.out.println("输出的页码为："+pageNo);

        return "index";
    }

    @RequestMapping("/editor")
    public String editor(){
        return "editor";
    }

    @RequestMapping("/blogs")
    public String blogList(Map<String, Object> map, String type, String tags, String keyword, Integer pageNo, Integer pageSize) {
        System.out.println("博客类型:"+type);
        Blog blog = new Blog();
        blog.setPageNo(pageNo);
        blog.setPageSize(9);
        blog.setBlogType(type);
        Page<Blog> blogs = blogService.getBlogListByPage(blog);
        PageInfo<Blog> pageInfo = new PageInfo<>(blogs);
        map.put("pageInfo", pageInfo);
        map.put("blogType", type);
        return "blogs";
    }

    @RequestMapping("/full")
    public String full() {
        return "full";
    }

    @RequestMapping("/blogDetail")
    public String blogDetail(String blogNumber, Map<String, Object> map) {
        System.out.println(blogNumber);
        Blog blog = blogService.getBlogDetail(blogNumber);
        map.put("blog", blog);
        return "blogDetail";
    }

    @RequestMapping("/resume")
    public String resume() {
        return "resume";
    }

    @RequestMapping("/uploadDemo")
    public String uploadDemo() {
        return "uploaddemo";
    }


}
