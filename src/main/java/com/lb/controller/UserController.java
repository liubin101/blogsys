package com.lb.controller;


import com.lb.entity.Users;
import com.lb.service.ArticleService;
import com.lb.service.UserService;
import com.lb.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/user")
@SessionAttributes("users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/go/{url}")
    public String gourl(@PathVariable String url)throws Exception{
        return "users/"+url;
    }

    @RequestMapping("/writeArticle/{id}")
    public String writeArticle(@PathVariable long id,Model model)throws Exception{
        Users users=userService.findUserById(id);
        model.addAttribute("user",users);
        return "/users/writeArticle";
    }

    @RequestMapping("/updPerInfo/{id}")
    public String updPerInfo(@PathVariable long id,Model model)throws Exception{
        Users users=userService.findUserById(id);
        model.addAttribute("user",users);
        return "/users/updPerInfo";
    }

    @RequestMapping("/go/personalPage/{userId}/{pageNow}")
    public String goPersonalPage(@PathVariable long userId,@PathVariable Integer pageNow, Model model)throws Exception {
        Users users=userService.findUserById(userId);
        model.addAttribute("user",users);
        PageBean pageBean=new PageBean();
        pageBean.setPageNow(pageNow);
        pageBean.setPageSize(10);
        pageBean=articleService.findArticlesByUserId(userId,pageBean);
        model.addAttribute("pageBean",pageBean);
        return "users/personalPage";
    }

    @RequestMapping("/userLogin")
    public String userLogin(Users users, Model model)throws Exception{
        users=userService.checkedLogin(users.getUsername(),users.getUserpw());
        if(users!=null){
            model.addAttribute("users",users);
            return "redirect:/";
        }
        model.addAttribute("errinfo","用户名或密码错误");
        return "common/userLogin";
    }

    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session, SessionStatus sessionStatus)throws Exception{
        session.removeAttribute("users");
        session.invalidate();
        sessionStatus.setComplete();
        return "redirect:/";
    }

    @RequestMapping("/userRegist")
    public String userRegist(Users users, Model model)throws Exception{
        if(userService.isUsernameExist(users.getUsername())){
            model.addAttribute("errinfo","用户名已存在");
            return "common/userReg";
        }
        if(userService.isNicknameExist(users.getNickname())){
            model.addAttribute("errinfo","昵称已存在");
            return "common/userReg";
        }
        userService.userRegister(users);
        return "common/userLogin";
    }

    @RequestMapping("/updPerInfo")
    public String updPerInfo(@ModelAttribute("users") Users users, MultipartFile u_headphoto, Model model, HttpServletRequest request)throws Exception{
        String originalFilename=u_headphoto.getOriginalFilename();
        if(u_headphoto!=null&&originalFilename!=null&&originalFilename.length()>0){
            String pic_path="F:\\develop\\upload\\temp\\";
            String newFileName= UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
            File newFile=new File(pic_path+newFileName);
            //将内存中的数据写入磁盘
            u_headphoto.transferTo(newFile);
            users.setHeadphoto(newFileName);
        }
        userService.updPerInfo(users);
        model.addAttribute("users",users);
        return "redirect:go/personalPage/"+users.getId()+"/1";
    }


}
