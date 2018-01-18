package org.deepwater.daisy.entity.blog;

import java.util.Date;

public class Blog {
    private Integer blogId;

    private String blogTitle;

    private String blogAuthor;

    private Date blogPublishtime;

    private String blogBannerurl;

    private String blogIntroduction;

    private String blogStatus;

    private String blogType;

    private String blogSubtitle;

    private String blogNumber;

    private String blogContent;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor == null ? null : blogAuthor.trim();
    }

    public Date getBlogPublishtime() {
        return blogPublishtime;
    }

    public void setBlogPublishtime(Date blogPublishtime) {
        this.blogPublishtime = blogPublishtime;
    }

    public String getBlogBannerurl() {
        return blogBannerurl;
    }

    public void setBlogBannerurl(String blogBannerurl) {
        this.blogBannerurl = blogBannerurl == null ? null : blogBannerurl.trim();
    }

    public String getBlogIntroduction() {
        return blogIntroduction;
    }

    public void setBlogIntroduction(String blogIntroduction) {
        this.blogIntroduction = blogIntroduction == null ? null : blogIntroduction.trim();
    }

    public String getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(String blogStatus) {
        this.blogStatus = blogStatus == null ? null : blogStatus.trim();
    }

    public String getBlogType() {
        return blogType;
    }

    public void setBlogType(String blogType) {
        this.blogType = blogType == null ? null : blogType.trim();
    }

    public String getBlogSubtitle() {
        return blogSubtitle;
    }

    public void setBlogSubtitle(String blogSubtitle) {
        this.blogSubtitle = blogSubtitle == null ? null : blogSubtitle.trim();
    }

    public String getBlogNumber() {
        return blogNumber;
    }

    public void setBlogNumber(String blogNumber) {
        this.blogNumber = blogNumber == null ? null : blogNumber.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }
}