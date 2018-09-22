package com.lb.service.impl;

import com.lb.entity.Users;
import com.lb.entity.UsersExample;
import com.lb.mapper.UsersMapper;
import com.lb.mapper.custom.UsersMapperCustom;
import com.lb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private UsersMapperCustom usersMapperCustom;

    @Override
    public Users findUserById(Long id) throws Exception {
        Users users=usersMapper.selectByPrimaryKey(id);
        return users;
    }

    @Override
    public Users checkedLogin(String username,String userpw)throws Exception{
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Users> usersList=usersMapper.selectByExample(usersExample);
        if(usersList!=null && userpw.equals(usersList.get(0).getUserpw()))
        {
            return usersList.get(0);
        }
        return null;
    }

    @Override
    public void userRegister(Users users)throws Exception{
        usersMapper.insertSelective(users);
    }

    @Override
    public boolean isUsernameExist(String username) throws Exception {
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Users> list=usersMapper.selectByExample(usersExample);
        if(list.size()>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isNicknameExist(String nickname) throws Exception {
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();
        criteria.andNicknameEqualTo(nickname);
        List<Users> list=usersMapper.selectByExample(usersExample);
        if(list.size()>0){
            return true;
        }
        return false;
    }

    @Override
    public void updPerInfo(Users users) throws Exception {
        usersMapper.updateByPrimaryKeySelective(users);
    }

    @Override
    public void updArticleNum(long artNum, long userId) throws Exception {
        HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("articlenum",artNum);
        map.put("id",userId);
        usersMapperCustom.updArtcleNumById(map);
    }


}
