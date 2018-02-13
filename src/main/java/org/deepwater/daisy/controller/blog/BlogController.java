package org.deepwater.daisy.controller.blog;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.common.Tools;
import org.deepwater.daisy.entity.blog.Blog;
import org.deepwater.daisy.entity.blog.Image;
import org.deepwater.daisy.entity.flag.Flag;
import org.deepwater.daisy.service.blog.BlogService;
import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

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

    @RequestMapping("/getBlogList")
    @ResponseBody
    public ReturnValue getBlogList(Blog blog) {
        ReturnValue rtv = new ReturnValue();
        Page<Blog> blogs = blogService.getBlogListByPage(blog);
        PageInfo<Blog> pageInfo = new PageInfo<>(blogs);
        JSONObject data = new JSONObject();
        data.put("pageInfo", pageInfo);
        rtv.setSuccess(true);
        rtv.setMsg("博客列表获取成功");
        rtv.setData(data);
        return rtv;
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

    @RequestMapping(value = "/getImageListByPage", method = RequestMethod.GET)
    @ResponseBody
    public ReturnValue getImageListByPage(Image image) {
        ReturnValue rtv = new ReturnValue();
        Page<Image> images = blogService.getImageListByPage(image);
        PageInfo<Image> pageInfo = new PageInfo<>(images);
        rtv.setSuccess(true);
        rtv.setData(pageInfo);
        rtv.setMsg("图片列表获取成功");
        return rtv;
    }

    @RequestMapping(value = "/addImage", method = RequestMethod.POST)
    @ResponseBody
    public ReturnValue addImage(@RequestBody Image image) {
        ReturnValue rtv = new ReturnValue();
        int result = blogService.addImage(image);
        if(result==1){
            rtv.setSuccess(true);
            rtv.setMsg("图片新增成功");
        } else {
            rtv.setMsg("图片新增失败");
        }
        return rtv;
    }

    @RequestMapping(value = "/deleteImage", method = RequestMethod.GET)
    @ResponseBody
    public ReturnValue deleteImage(Integer imageId) {
        ReturnValue rtv = new ReturnValue();
        int result = blogService.deleteImage(imageId);
        if(result==1){
            rtv.setSuccess(true);
            rtv.setMsg("图片删除成功");
        } else {
            rtv.setMsg("图片删除失败");
        }
        return rtv;
    }

    @RequestMapping(value = "/updateImage", method = RequestMethod.POST)
    @ResponseBody
    public ReturnValue updateImage(@RequestBody Image image) {
        ReturnValue rtv = new ReturnValue();
        int result = blogService.updateImage(image);
        if(result==1){
            rtv.setSuccess(true);
            rtv.setMsg("图片更新成功");
        } else {
            rtv.setMsg("图片更新失败");
        }
        return rtv;
    }



    @RequestMapping("selectFlagList")
    @ResponseBody
    public ReturnValue selectFlagList(){
        ReturnValue rtv = new ReturnValue();
        rtv.setData(blogService.selectFlagList());
        rtv.setSuccess(true);
        rtv.setMsg("文章标签获取成功");
        return rtv;
    }

    @RequestMapping(value="/saveFlag", method = RequestMethod.POST)
    @ResponseBody
    public ReturnValue saveFlag(@RequestBody Flag flag) {
        System.out.println(flag);
        ReturnValue rtv = new ReturnValue();
        String flagNumber = Tools.CreateID("FL");
        flag.setFlagNumber(flagNumber);
        if(blogService.saveBlog(flag)==1){
            rtv.setSuccess(true);
            rtv.setData(flagNumber);
            rtv.setMsg("标签保存成功");
        } else {
            rtv.setMsg("标签保存失败");
        }
        return rtv;
    }

    /**
     * AND 语句查询
     *
     * @param blogContent
     * @param blogTitle
     * @return
     */
    @RequestMapping(value = "/api/city/and/find", method = RequestMethod.GET)
    public List<Blog> findByDescriptionAndScore(@RequestParam(value = "blogContent") String blogContent,
                                                @RequestParam(value = "blogTitle") String blogTitle) {
        return blogService.findByDescriptionAndScore(blogContent, blogTitle);
    }

    /**
     * LIKE 语句查询
     *
     * @param blogContent
     * @return
     */
    @RequestMapping(value = "/api/city/like/find", method = RequestMethod.GET)
    public List<Blog> findByDescriptionLike(@RequestParam(value = "blogContent") String blogContent) {
        return blogService.findByDescriptionLike(blogContent);
    }

}
