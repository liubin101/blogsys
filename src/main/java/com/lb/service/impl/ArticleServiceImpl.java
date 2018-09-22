package com.lb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lb.entity.*;
import com.lb.entity.custom.ArtCommentCustom;
import com.lb.entity.custom.ArticleCustom;
import com.lb.mapper.ArtCommentMapper;
import com.lb.mapper.ArticleMapper;
import com.lb.mapper.UsersMapper;
import com.lb.mapper.custom.ArtCommentMapperCustom;
import com.lb.mapper.custom.ArticleMapperCustom;
import com.lb.service.ArticleService;
import com.lb.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleMapperCustom articleMapperCustom;
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private ArtCommentMapper artCommentMapper;
    @Autowired
    private ArtCommentMapperCustom artCommentMapperCustom;

    @Override
    public void writeArticle(Article article) throws Exception {
        articleMapper.insertSelective(article);
    }

    @Override
    public PageBean findArticlesByUserId(long userId, PageBean pageBean) throws Exception {
        PageHelper.startPage(pageBean.getPageNow(),pageBean.getPageSize());
        ArticleExample articleExample=new ArticleExample();
        articleExample.setOrderByClause("createtime desc");
        ArticleExample.Criteria criteria=articleExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Article> articles=articleMapper.selectByExample(articleExample);
        PageInfo<Article> pageInfo=new PageInfo<>(articles);
        pageBean.setTotal(pageInfo.getTotal());
        pageBean.setPages(pageInfo.getPages());
        pageBean.setList(pageInfo.getList());
        return pageBean;
    }

    @Override
    public Article findArticleById(long articleId) throws Exception {
        Article article=articleMapper.selectByPrimaryKey(articleId);
        return article;
    }

    @Override
    public PageBean showAllArticles(PageBean pageBean) throws Exception {
        PageHelper.startPage(pageBean.getPageNow(),pageBean.getPageSize());
        List<ArticleCustom> articleCustoms=articleMapperCustom.findAllArticles();
        for(int i=0;i<articleCustoms.size();i++){
            Users users=usersMapper.selectByPrimaryKey(articleCustoms.get(i).getUserid());
            articleCustoms.get(i).setHeadphoto(users.getHeadphoto());
            articleCustoms.get(i).setNickname(users.getNickname());
        }
        PageInfo<ArticleCustom> pageInfo=new PageInfo<>(articleCustoms);
        pageBean.setTotal(pageInfo.getTotal());
        pageBean.setPages(pageInfo.getPages());
        pageBean.setList(pageInfo.getList());
        return pageBean;
    }

    @Override
    public void updateArticleLooknum(long looknum,long articleId) throws Exception {
        HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("looknum",looknum);
        map.put("id",articleId);
        articleMapperCustom.updateLooknumById(map);
    }

    @Override
    public void updateArticleCommentnum(long commentnum, long articleId) throws Exception {
        HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("commentsnum",commentnum);
        map.put("id",articleId);
        articleMapperCustom.updateCommentsnumById(map);
    }

    @Override
    public PageBean showAllCommentsByArtId(PageBean pageBean,long artId) throws Exception {
        PageHelper.startPage(pageBean.getPageNow(),pageBean.getPageSize());
        List<ArtCommentCustom> artCommentCustoms=artCommentMapperCustom.findCommentsByArtId(artId);
        for(int i=0;i<artCommentCustoms.size();i++){
            Users users=usersMapper.selectByPrimaryKey(artCommentCustoms.get(i).getUserid());
            artCommentCustoms.get(i).setHeadphoto(users.getHeadphoto());
            artCommentCustoms.get(i).setNickname(users.getNickname());
        }
        PageInfo<ArtCommentCustom> pageInfo=new PageInfo<>(artCommentCustoms);
        pageBean.setTotal(pageInfo.getTotal());
        pageBean.setPages(pageInfo.getPages());
        pageBean.setList(pageInfo.getList());
        return pageBean;
    }

    @Override
    public void writeComment(ArtComment artComment) throws Exception {
        artCommentMapper.insertSelective(artComment);
    }

    @Override
    public long countCommentsByArtId(long artId) throws Exception {
        ArtCommentExample artCommentExample=new ArtCommentExample();
        ArtCommentExample.Criteria criteria=artCommentExample.createCriteria();
        criteria.andArtidEqualTo(artId);
        long commentNum=artCommentMapper.countByExample(artCommentExample);
        return commentNum;
    }

    @Override
    public PageBean showArticlesByClass(PageBean pageBean,String artclass) throws Exception {
        PageHelper.startPage(pageBean.getPageNow(),pageBean.getPageSize());
        List<ArticleCustom> articleCustoms=articleMapperCustom.findAllArticlesByClass(artclass);
        for(int i=0;i<articleCustoms.size();i++){
            Users users=usersMapper.selectByPrimaryKey(articleCustoms.get(i).getUserid());
            articleCustoms.get(i).setHeadphoto(users.getHeadphoto());
            articleCustoms.get(i).setNickname(users.getNickname());
        }
        PageInfo<ArticleCustom> pageInfo=new PageInfo<>(articleCustoms);
        pageBean.setTotal(pageInfo.getTotal());
        pageBean.setPages(pageInfo.getPages());
        pageBean.setList(pageInfo.getList());
        return pageBean;
    }

    @Override
    public PageBean searchArticleByTitle(PageBean pageBean, String title) throws Exception {
        PageHelper.startPage(pageBean.getPageNow(),pageBean.getPageSize());
        List<ArticleCustom> articleCustoms=articleMapperCustom.searchAllArticlesByTitle(title);
        for(int i=0;i<articleCustoms.size();i++){
            Users users=usersMapper.selectByPrimaryKey(articleCustoms.get(i).getUserid());
            articleCustoms.get(i).setHeadphoto(users.getHeadphoto());
            articleCustoms.get(i).setNickname(users.getNickname());
        }
        PageInfo<ArticleCustom> pageInfo=new PageInfo<>(articleCustoms);
        pageBean.setTotal(pageInfo.getTotal());
        pageBean.setPages(pageInfo.getPages());
        pageBean.setList(pageInfo.getList());
        return pageBean;
    }
}
