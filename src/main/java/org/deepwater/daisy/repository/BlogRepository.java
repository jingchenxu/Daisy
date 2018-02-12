package org.deepwater.daisy.repository;

import org.deepwater.daisy.entity.blog.Blog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends ElasticsearchRepository<Blog, Integer> {

    /**
     * AND 语句查询
     *
     * @param blogContent
     * @param blogTitle
     * @return
     */
    List<Blog> findByBlogContentAndBlogTitle(String blogContent, String blogTitle);

    /**
     * OR 语句查询
     *
     * @param blogContent
     * @param blogTitle
     * @return
     */
    List<Blog> findByBlogContentOrBlogTitle(String blogContent, String blogTitle);
    /**
     * 查询城市描述
     *
     * 等同于下面代码
     * @Query("{\"bool\" : {\"must\" : {\"term\" : {\"description\" : \"?0\"}}}}")
     * Page<City> findByDescription(String description, Pageable pageable);
     *
     * @param blogContent
     * @param page
     * @return
     */
    Page<Blog> findByBlogContent(String blogContent, Pageable page);

    /**
     * NOT 语句查询
     *
     * @param blogContent
     * @param page
     * @return
     */
    Page<Blog> findByBlogContentNot(String blogContent, Pageable page);

    /**
     * LIKE 语句查询
     *
     * @param blogContent
     * @param page
     * @return
     */
    Page<Blog> findByBlogContentLike(String blogContent, Pageable page);
}
