package com.www.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author www
 * @version 1.0
 * @create 2021/7/7 15:31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
     public static void main(String[] args) {
           SpringApplication.run(OrderNacosMain83.class, args);
      }

}
