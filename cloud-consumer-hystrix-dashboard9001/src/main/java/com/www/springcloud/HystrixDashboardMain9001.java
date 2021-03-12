package com.www.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author www
 * @version 1.0
 * @create 2021/3/2 15:35
 */
@SpringBootApplication
@EnableHystrixDashboard
@Slf4j
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
        System.out.println("启动链接地址：http://localhost:9001/hystrix");
    }
}
