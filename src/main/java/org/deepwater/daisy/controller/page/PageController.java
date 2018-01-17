package org.deepwater.daisy.controller.page;

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


}
