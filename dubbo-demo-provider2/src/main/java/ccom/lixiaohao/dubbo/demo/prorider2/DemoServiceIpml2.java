package ccom.lixiaohao.dubbo.demo.prorider2;

import com.alibaba.dubbo.config.annotation.Service;
import com.lixiaohao.dubbo.demo.service.DemoService;

import javax.annotation.PostConstruct;

/**
 * Created by xiaohao.li on 2017/8/21.
 */

@Service(version = "1.0.0")
public class DemoServiceIpml2 implements DemoService{
    @Override
    public String sayHello(String args) {
        return "已调用:" + args;
    }

    @PostConstruct
    public void  tests() {
        System.out.println("111111111111111111111111111111111111111111111111");
    }
}
