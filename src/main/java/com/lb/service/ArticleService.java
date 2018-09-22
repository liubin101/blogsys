package com.lb.service;

import com.lb.entity.ArtComment;
import com.lb.entity.Article;
import com.lb.utils.PageBean;

public interface ArticleService {
    public void writeArticle(Article article)throws Exception;

    public PageBean findArticlesByUserId(long userId,PageBean pageBean)throws Exception;

    public Article findArticleById(long articleId)throws Exception;

    public PageBean showAllArticles(PageBean pageBean)throws Exception;

    public void updateArticleLooknum(long looknum,long articleId)throws Exception;

    public void updateArticleCommentnum(long commentnum,long articleId)throws Exception;

    public PageBean showAllCommentsByArtId(PageBean pageBean,long artId)throws Exception;

    public void writeComment(ArtComment artComment)throws Exception;

    public long countCommentsByArtId(long artId)throws Exception;

    public PageBean showArticlesByClass(PageBean pageBean,String artclass)throws Exception;

    public PageBean searchArticleByTitle(PageBean pageBean,String title)throws Exception;
}
