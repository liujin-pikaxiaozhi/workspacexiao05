package com.liujin.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:liujin
 * @date: 2020/7/14 22:30
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServer {

    public static void main(String[] args) {
        System.out.println("注册中心1111111启动了");
        SpringApplication.run(StartEurekaServer.class,args);
    }

}
