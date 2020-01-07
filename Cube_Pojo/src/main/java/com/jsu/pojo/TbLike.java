package com.jsu.pojo;

import java.util.Date;

public class TbLike {
    private Integer lkId;

    private Date lkCreateTime;

    private Integer lkType;

    private Integer userId;

    private Integer likedId;

    public Integer getLkId() {
        return lkId;
    }

    public void setLkId(Integer lkId) {
        this.lkId = lkId;
    }

    public Date getLkCreateTime() {
        return lkCreateTime;
    }

    public void setLkCreateTime(Date lkCreateTime) {
        this.lkCreateTime = lkCreateTime;
    }

    public Integer getLkType() {
        return lkType;
    }

    public void setLkType(Integer lkType) {
        this.lkType = lkType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLikedId() {
        return likedId;
    }

    public void setLikedId(Integer likedId) {
        this.likedId = likedId;
    }
}