package com.lixiaohao.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by xiaohao.li on 2017/6/27.
 */
@SpringBootApplication //
@Configuration
@ComponentScan(basePackages = {"com.lixiaohao.demo.user"})
@ImportResource("classpath:dubbo-demo-consumer.xml")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
