package com.liujin.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:liujin
 * @date: 2020/7/14 9:48
 * @description:
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
       System.out.println("客户端");
        SpringApplication.run(EurekaClientApplication.class,args);
    }

}
