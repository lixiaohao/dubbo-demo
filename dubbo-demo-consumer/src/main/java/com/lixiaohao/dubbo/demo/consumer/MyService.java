package com.lixiaohao.dubbo.demo.consumer;

import com.lixiaohao.dubbo.demo.service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xiaohao.li on 2017/6/27.
 */
public class MyService {
    private DemoService demoService;

    public DemoService getDemoService() {
        return demoService;
    }

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
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
