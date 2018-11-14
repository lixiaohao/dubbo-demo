package com.lixiaohao.demo.user.controller;

import com.lixiaohao.demo.user.service.UserInfoService;
import com.lixiaohao.dubbo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohao.li on 2017/6/27.
 */
//@EnableAutoConfiguration
@RestController
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("index")
    public String index(){
        System.out.println("welcome to my first spring boot demo !");
        return "welcome to spring boot !";
    }

    @RequestMapping("insertuser")
    public String insert(){
        User user = new User();
        user.setId(15);
        user.setUserName("ques");
        user.setUserAge(22);
        user.setUserPass("敢死队高2532");
        userInfoService.insertUser(user);

        return "zhangsan 123456";
    }


    @RequestMapping("userinfo")
    public List<User> userInfo(){
        List<User> users = new ArrayList<User>();
        users =userInfoService.find();
        return users;
    }

    @RequestMapping("userinfopage")
    public List<User> userInfoPage(int start,int limit){
        List<User> users = new ArrayList<User>();
        users =userInfoService.findPage(start,limit);
        return users;
    }

    @RequestMapping("queryPage")
    public List<User> queryPage(String name,int start,int limit){
        List<User> users = new ArrayList<User>();
        users =userInfoService.queryPage(name,start,limit);
        return users;
    }

}
