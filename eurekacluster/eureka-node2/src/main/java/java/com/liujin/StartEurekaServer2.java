package java.com.liujin;

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
public class StartEurekaServer2 {

    public static void main(String[] args) {
        System.out.println("注册中心2222222启动了");
        SpringApplication.run(StartEurekaServer2.class,args);
    }

}
