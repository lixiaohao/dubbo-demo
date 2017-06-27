package com.lixiaohao.demo.user.controller;

import com.lixiaohao.dubbo.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaohao.li on 2017/6/27.
 */
//@EnableAutoConfiguration
@RestController
public class UserController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("index")
    public String index(){
        System.out.println("welcome to my first spring boot demo !");
        demoService.sayHello("hello!");
        return "welcome to spring boot !";
    }

}
