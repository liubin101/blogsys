package com.lb.entity;

import java.util.Date;

public class Album {
    private Long id;

    private Long userid;

    private String title;

    private Date createtime;

    private Short photonum;

    private String coverphoto;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Short getPhotonum() {
        return photonum;
    }

    public void setPhotonum(Short photonum) {
        this.photonum = photonum;
    }

    public String getCoverphoto() {
        return coverphoto;
    }

    public void setCoverphoto(String coverphoto) {
        this.coverphoto = coverphoto == null ? null : coverphoto.trim();
    }
}