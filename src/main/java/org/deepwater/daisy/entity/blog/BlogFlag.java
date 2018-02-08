package org.deepwater.daisy.entity.blog;

public class BlogFlag {
    private Integer blogflagId;

    private String blogflagBlogNumber;

    private String blogflagFlagNumber;

    public Integer getBlogflagId() {
        return blogflagId;
    }

    public void setBlogflagId(Integer blogflagId) {
        this.blogflagId = blogflagId;
    }

    public String getBlogflagBlogNumber() {
        return blogflagBlogNumber;
    }

    public void setBlogflagBlogNumber(String blogflagBlogNumber) {
        this.blogflagBlogNumber = blogflagBlogNumber == null ? null : blogflagBlogNumber.trim();
    }

    public String getBlogflagFlagNumber() {
        return blogflagFlagNumber;
    }

    public void setBlogflagFlagNumber(String blogflagFlagNumber) {
        this.blogflagFlagNumber = blogflagFlagNumber == null ? null : blogflagFlagNumber.trim();
    }
}