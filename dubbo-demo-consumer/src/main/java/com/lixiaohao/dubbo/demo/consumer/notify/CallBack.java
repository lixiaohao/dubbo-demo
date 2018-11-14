package com.lixiaohao.dubbo.demo.consumer.notify;

import java.util.Map;

/**
 * Created by xiaohao.li on 2017/8/22.
 */
public interface CallBack {

     void onreturn(Object res, Object... args);

     void onthrow(Throwable ex, Object... args);
}
