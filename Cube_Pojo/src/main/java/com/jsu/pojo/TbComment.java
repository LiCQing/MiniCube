package com.jsu.pojo;

import java.util.Date;

public class TbComment {
    private Integer cmtId;

    private String cmtContent;

    private Date cmtCreateTime;

    private Integer cmtStatus;

    private Integer cmtReplyType;

    private Integer userId;

    private Integer replyId;

    public Integer getCmtId() {
        return cmtId;
    }

    public void setCmtId(Integer cmtId) {
        this.cmtId = cmtId;
    }

    public String getCmtContent() {
        return cmtContent;
    }

    public void setCmtContent(String cmtContent) {
        this.cmtContent = cmtContent == null ? null : cmtContent.trim();
    }

    public Date getCmtCreateTime() {
        return cmtCreateTime;
    }

    public void setCmtCreateTime(Date cmtCreateTime) {
        this.cmtCreateTime = cmtCreateTime;
    }

    public Integer getCmtStatus() {
        return cmtStatus;
    }

    public void setCmtStatus(Integer cmtStatus) {
        this.cmtStatus = cmtStatus;
    }

    public Integer getCmtReplyType() {
        return cmtReplyType;
    }

    public void setCmtReplyType(Integer cmtReplyType) {
        this.cmtReplyType = cmtReplyType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }
}