package com.lixiaohao.dubbo.demo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lixiaohao.dubbo.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xiaohao.li on 2017/6/27.
 */
//@Service("myService")
public class MyService {

//    @Autowired
//    @Reference(version = "1.0.0")
    private DemoService demoService;

    public DemoService getDemoService() {
        return demoService;
    }

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

    // 默认加载该方法，等同于等同与init-method=init
    @PostConstruct
    public void start() throws Exception{
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            try {
                String hello = demoService.sayHello("world" + i);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }
    }
}
