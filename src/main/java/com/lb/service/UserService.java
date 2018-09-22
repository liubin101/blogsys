package com.lb.service;

import com.lb.entity.Users;

public interface UserService {

    public Users findUserById(Long id)throws Exception;

    public Users checkedLogin(String username,String userpw)throws Exception;

    public void userRegister(Users users)throws Exception;

    public boolean isUsernameExist(String username)throws Exception;

    public boolean isNicknameExist(String nickname)throws Exception;

    public void updPerInfo(Users users)throws Exception;

    public void updArticleNum(long artNum,long userId)throws Exception;
}
