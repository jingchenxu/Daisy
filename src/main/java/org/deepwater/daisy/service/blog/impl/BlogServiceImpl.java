package org.deepwater.daisy.service.blog.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.deepwater.daisy.common.ReturnValue;
import org.deepwater.daisy.common.Tools;
import org.deepwater.daisy.entity.blog.Blog;
import org.deepwater.daisy.entity.blog.BlogFlag;
import org.deepwater.daisy.entity.blog.Image;
import org.deepwater.daisy.entity.flag.Flag;
import org.deepwater.daisy.mapper.blog.BlogFlagMapper;
import org.deepwater.daisy.mapper.blog.BlogMapper;
import org.deepwater.daisy.mapper.blog.ImageMapper;
import org.deepwater.daisy.mapper.flag.FlagMapper;
import org.deepwater.daisy.repository.BlogRepository;
import org.deepwater.daisy.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private static final Integer pageNumber = 0;
    private static final Integer pageSize = 10;
    Pageable pageable = new PageRequest(pageNumber, pageSize);

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private FlagMapper flagMapper;

    @Autowired
    private BlogFlagMapper blogFlagMapper;

    @Autowired
    private ImageMapper imageMapper;

    @Autowired
    BlogRepository blogRepository;

    @Override
    public ReturnValue saveBlog(Blog blog) {
        ReturnValue rtv = new ReturnValue();
        try {
            // 创建博客序列号
            String blogNumber = Tools.CreateID("BL");
            blog.setBlogAuthor("jcxu");
            blog.setBlogNumber(blogNumber);
            blog.setBlogPublishtime(new Date());
            int saveBlog = blogMapper.insert(blog);
            // 返回博客保存信息 病保存到ES当中
            Blog temp1 = blogMapper.selectByBlogNumber(blogNumber);
            addBlog(temp1);
            // 保存tag中间表
            List<String> tags = blog.getTags();
            List<BlogFlag> blogFlags = new ArrayList<>();
            for (String item: tags){
                BlogFlag temp = new BlogFlag();
                temp.setBlogflagBlogNumber(blogNumber);
                temp.setBlogflagFlagNumber(item);
                blogFlags.add(temp);
            }
            blogFlagMapper.insertAll(blogFlags);
            System.out.println("==========");
            System.out.println(tags);
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

    @Override
    public Page<Image> getImageListByPage(Image image) {
        try {
            PageHelper.startPage(image.getPageNo(), image.getPageSize());
            return imageMapper.getImageListByPage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Flag> selectFlagList() {
        return flagMapper.selectFlagList();
    }

    @Override
    public int saveBlog(Flag flag) {
        return flagMapper.insert(flag);
    }

    @Override
    public List<Image> getIndexImage() {
        return imageMapper.getIndexImage();
    }

    @Override
    public int deleteImage(Integer imageId) {
        return imageMapper.deleteByPrimaryKey(imageId);
    }

    @Override
    public int addImage(Image image) {
        return imageMapper.insert(image);
    }

    @Override
    public int updateImage(Image image) {
        return imageMapper.updateByPrimaryKey(image);
    }

    public List<Blog> findByDescriptionAndScore(String blogContent, String blogTitle) {
        return blogRepository.findByBlogContentAndBlogTitle(blogContent, blogTitle);
    }

    public List<Blog> findByDescriptionOrScore(String blogContent, String blogTitle) {
        return blogRepository.findByBlogContentOrBlogTitle(blogContent, blogTitle);
    }

    public List<Blog> findByDescription(String blogContent) {
        return blogRepository.findByBlogContent(blogContent, pageable).getContent();
    }

    public List<Blog> findByDescriptionNot(String blogContent) {
        return blogRepository.findByBlogContentNot(blogContent, pageable).getContent();
    }

    public List<Blog> findByDescriptionLike(String blogContent) {
        System.out.println("=========="+blogContent);
        return blogRepository.findByBlogContentLike(blogContent, pageable).getContent();
    }

    @Override
    public Integer addBlog(Blog blog) {
        Blog blog1 = blogRepository.save(blog);
        return blog1.getBlogId();
    }
}
