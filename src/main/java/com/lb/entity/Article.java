package com.lb.entity;

import java.util.Date;

public class Article {
    private Long id;

    private Long userid;

    private String title;

    private Date createtime;

    private Long looknum;

    private Long likenum;

    private Long dislikenum;

    private Long commentsnum;

    private Short ischecked;

    private String artclass;

    private String acontent;

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

    public Long getLooknum() {
        return looknum;
    }

    public void setLooknum(Long looknum) {
        this.looknum = looknum;
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

    public Long getCommentsnum() {
        return commentsnum;
    }

    public void setCommentsnum(Long commentsnum) {
        this.commentsnum = commentsnum;
    }

    public Short getIschecked() {
        return ischecked;
    }

    public void setIschecked(Short ischecked) {
        this.ischecked = ischecked;
    }

    public String getArtclass() {
        return artclass;
    }

    public void setArtclass(String artclass) {
        this.artclass = artclass == null ? null : artclass.trim();
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent == null ? null : acontent.trim();
    }
}