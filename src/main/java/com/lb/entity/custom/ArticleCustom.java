package com.lb.entity.custom;

import com.lb.entity.Article;

public class ArticleCustom extends Article {
    private String headphoto;
    private String nickname;

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
