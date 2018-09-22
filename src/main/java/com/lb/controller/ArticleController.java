package com.lb.controller;

import com.lb.entity.ArtComment;
import com.lb.entity.Article;
import com.lb.entity.Users;
import com.lb.service.ArticleService;
import com.lb.service.UserService;
import com.lb.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;

    @RequestMapping("/articleDetail/{articleId}/{pageNow}")
    public String articleDetail(@PathVariable long articleId,@PathVariable Integer pageNow, Model model)throws Exception{
        Article article=articleService.findArticleById(articleId);
        long article_looknum=article.getLooknum()+1;
        article.setLooknum(article_looknum);
        articleService.updateArticleLooknum(article_looknum,article.getId());
        Users users=userService.findUserById(article.getUserid());
        model.addAttribute("article",article);
        model.addAttribute("user",users);

        PageBean pageBean=new PageBean();
        pageBean.setPageNow(pageNow);
        pageBean.setPageSize(20);
        pageBean=articleService.showAllCommentsByArtId(pageBean,articleId);
        model.addAttribute("pageBean",pageBean);
        return "common/articleDetail";
    }

    @RequestMapping("/articleSubmit")
    public String articleSubmit(HttpSession session, Article article, Model model)throws Exception{
        Users users=(Users)session.getAttribute("users");
        article.setUserid(users.getId());
        article.setCreatetime(new Date());
        articleService.writeArticle(article);
        long articlenum=users.getArticlenum()+1;
        userService.updArticleNum(articlenum,users.getId());
        users=userService.findUserById(users.getId());
        session.setAttribute("users",users);
        return "redirect:/users/go/personalPage/"+users.getId()+"/1";
    }

    @RequestMapping("/commentSubmit")
    public String commentSubmit(HttpSession session, ArtComment artComment,Model model)throws Exception{
        Users users=(Users)session.getAttribute("users");
        artComment.setUserid(users.getId());
        artComment.setCreatetime(new Date());
        articleService.writeComment(artComment);
        long art_commentNum=articleService.countCommentsByArtId(artComment.getArtid());
        articleService.updateArticleCommentnum(art_commentNum,artComment.getArtid());
        return "redirect:articleDetail/"+artComment.getArtid()+"/1";
    }



}
