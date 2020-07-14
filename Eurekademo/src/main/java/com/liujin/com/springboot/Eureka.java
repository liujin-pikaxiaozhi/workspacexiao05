package com.liujin.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:liujin
 * @date: 2020/7/14 9:31
 * @description:
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class,args);
    }

}
