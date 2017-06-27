package com.lixiaohao.dubbo.demo.provider;

import com.lixiaohao.dubbo.demo.service.DemoService;

/**
 * Created by xiaohao.li on 2017/6/27.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String args) {
        System.out.println("请求成功！！请求参数:"+args);
        return "rerurn params:"+args;
    }
}
