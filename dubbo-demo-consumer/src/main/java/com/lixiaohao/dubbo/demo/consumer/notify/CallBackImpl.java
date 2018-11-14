package com.lixiaohao.dubbo.demo.consumer.notify;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaohao.li on 2017/8/22.
 */
@Component("methodCallBack")
public class CallBackImpl implements CallBack {

    public Map<Integer, String>    ret    = new HashMap<Integer, String>();
    public Map<Integer, Throwable> errors = new HashMap<Integer, Throwable>();


    public void onreturn(Object res, Object... args) {
        System.out.println("返回值："+res);
        for (Object object : args) {
            System.out.println("参数："+object);
        }
    }

    public void onthrow(Throwable ex, Object... args) {
        System.out.println("异常："+ex.getMessage());
        for (Object object : args) {
            System.out.println("异常参数："+object);
        }
    }
}
