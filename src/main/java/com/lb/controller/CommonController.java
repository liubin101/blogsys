package com.lb.controller;


import com.lb.service.ArticleService;
import com.lb.service.UserService;
import com.lb.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String goIndex(Model model){
        return "redirect:/1";
    }

    @RequestMapping("/{pageNow}")
    public String goIndex(@PathVariable Integer pageNow, Model model)throws Exception{
        PageBean pageBean=new PageBean();
        pageBean.setPageNow(pageNow);
        pageBean.setPageSize(10);
        pageBean=articleService.showAllArticles(pageBean);
        model.addAttribute("pageBean",pageBean);
        return "common/index";
    }

    @RequestMapping("/classes/{artclass}/{pageNow}")
    public String showByClasses(@PathVariable String artclass,@PathVariable Integer pageNow,Model model)throws Exception{
        PageBean pageBean=new PageBean();
        pageBean.setPageNow(pageNow);
        pageBean.setPageSize(10);
        pageBean=articleService.showArticlesByClass(pageBean,artclass);
        model.addAttribute("pageBean",pageBean);
        return "common/searchArticle";
    }

    @RequestMapping("/searchArticle/{title}/{pageNow}")
    public String searchArticle(@PathVariable String title,@PathVariable Integer pageNow,Model model)throws Exception{
        PageBean pageBean=new PageBean();
        pageBean.setPageNow(pageNow);
        pageBean.setPageSize(10);
        pageBean=articleService.searchArticleByTitle(pageBean,title);
        model.addAttribute("pageBean",pageBean);
        return "common/searchArticle";
    }

    @RequestMapping("/go/{url}")
    public String goUrl(@PathVariable String url){
        return "common/"+url;
    }
}
