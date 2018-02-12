package org.deepwater.daisy.entity.blog;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Document(indexName = "blogid", type = "blog", shards = 1, replicas = 0)
public class Blog implements Serializable {

    private static final long serialVersionUID = -1L;

    @Id
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

    private List<String> tags;

    private int pageNo;

    private int pageSize;

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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogAuthor='" + blogAuthor + '\'' +
                ", blogPublishtime=" + blogPublishtime +
                ", blogBannerurl='" + blogBannerurl + '\'' +
                ", blogIntroduction='" + blogIntroduction + '\'' +
                ", blogStatus='" + blogStatus + '\'' +
                ", blogType='" + blogType + '\'' +
                ", blogSubtitle='" + blogSubtitle + '\'' +
                ", blogNumber='" + blogNumber + '\'' +
                ", blogContent='" + blogContent + '\'' +
                ", tags=" + tags +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}