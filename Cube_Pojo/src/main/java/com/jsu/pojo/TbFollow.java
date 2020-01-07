package com.jsu.pojo;

import java.util.Date;

public class TbFollow {
    private Integer flId;

    private Integer flUserId;

    private Date flCreateTime;

    private Integer fledUserId;

    private Date flInteractTime;

    public Integer getFlId() {
        return flId;
    }

    public void setFlId(Integer flId) {
        this.flId = flId;
    }

    public Integer getFlUserId() {
        return flUserId;
    }

    public void setFlUserId(Integer flUserId) {
        this.flUserId = flUserId;
    }

    public Date getFlCreateTime() {
        return flCreateTime;
    }

    public void setFlCreateTime(Date flCreateTime) {
        this.flCreateTime = flCreateTime;
    }

    public Integer getFledUserId() {
        return fledUserId;
    }

    public void setFledUserId(Integer fledUserId) {
        this.fledUserId = fledUserId;
    }

    public Date getFlInteractTime() {
        return flInteractTime;
    }

    public void setFlInteractTime(Date flInteractTime) {
        this.flInteractTime = flInteractTime;
    }
}