package com.lb.entity;

import java.util.Date;

public class Userfocus {
    private Long id;

    private Long userid;

    private Long beuserid;

    private Date focustime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getBeuserid() {
        return beuserid;
    }

    public void setBeuserid(Long beuserid) {
        this.beuserid = beuserid;
    }

    public Date getFocustime() {
        return focustime;
    }

    public void setFocustime(Date focustime) {
        this.focustime = focustime;
    }
}