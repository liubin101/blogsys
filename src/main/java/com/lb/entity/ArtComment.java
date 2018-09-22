package com.lb.entity;

import java.util.Date;

public class ArtComment {
    private Long id;

    private Long userid;

    private Long artid;

    private Date createtime;

    private String ccontent;

    private Long likenum;

    private Long dislikenum;

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

    public Long getArtid() {
        return artid;
    }

    public void setArtid(Long artid) {
        this.artid = artid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent == null ? null : ccontent.trim();
    }

    public Long getLikenum() {
        return likenum;
    }

    public void setLikenum(Long likenum) {
        this.likenum = likenum;
    }

    public Long getDislikenum() {
        return dislikenum;
    }

    public void setDislikenum(Long dislikenum) {
        this.dislikenum = dislikenum;
    }
}