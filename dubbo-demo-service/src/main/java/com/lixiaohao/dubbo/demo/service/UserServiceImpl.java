package com.lixiaohao.dubbo.demo.service;

import com.lixiaohao.dubbo.demo.dao.UserDao;
import com.lixiaohao.dubbo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiaohao.li on 2017/6/28.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public void insertUser(User user){
        this.userDao.insertUser(user);
    }

    public List<User> find(){
        return userDao.find();
    }

    public List<User> findPage(int start,int limit){
        return   userDao.findPage(start,limit);
    }

    public List<User> queryPage(String UserName, int start, int limit) {
        return userDao.queryPage(UserName,start,limit);
    }
}
