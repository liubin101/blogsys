package com.lb.entity;

import java.util.Date;

public class Users {
    private Long id;

    private String username;

    private String userpw;

    private Short sex;

    private Date birth;

    private String tel;

    private String email;

    private String address;

    private String headphoto;

    private String signature;

    private Short ulevel;

    private Long focusnum;

    private Long fansnum;

    private Long articlenum;

    private Long albumnum;

    private String nickname;

    private Long commentnum;

    private String qq;

    private String job;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw == null ? null : userpw.trim();
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto == null ? null : headphoto.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Short getUlevel() {
        return ulevel;
    }

    public void setUlevel(Short ulevel) {
        this.ulevel = ulevel;
    }

    public Long getFocusnum() {
        return focusnum;
    }

    public void setFocusnum(Long focusnum) {
        this.focusnum = focusnum;
    }

    public Long getFansnum() {
        return fansnum;
    }

    public void setFansnum(Long fansnum) {
        this.fansnum = fansnum;
    }

    public Long getArticlenum() {
        return articlenum;
    }

    public void setArticlenum(Long articlenum) {
        this.articlenum = articlenum;
    }

    public Long getAlbumnum() {
        return albumnum;
    }

    public void setAlbumnum(Long albumnum) {
        this.albumnum = albumnum;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Long getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Long commentnum) {
        this.commentnum = commentnum;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }
}