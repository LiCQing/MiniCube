package com.jsu.pojo;

import java.util.Date;

public class TbBlog {
    private Integer blogId;

    private String blogContent;

    private Integer blogType;

    private Date blogCreateTime;

    private Integer blogStatus;

    private Integer blogPubType;

    private Date blogSendTime;

    private Integer userId;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public Integer getBlogType() {
        return blogType;
    }

    public void setBlogType(Integer blogType) {
        this.blogType = blogType;
    }

    public Date getBlogCreateTime() {
        return blogCreateTime;
    }

    public void setBlogCreateTime(Date blogCreateTime) {
        this.blogCreateTime = blogCreateTime;
    }

    public Integer getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(Integer blogStatus) {
        this.blogStatus = blogStatus;
    }

    public Integer getBlogPubType() {
        return blogPubType;
    }

    public void setBlogPubType(Integer blogPubType) {
        this.blogPubType = blogPubType;
    }

    public Date getBlogSendTime() {
        return blogSendTime;
    }

    public void setBlogSendTime(Date blogSendTime) {
        this.blogSendTime = blogSendTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}