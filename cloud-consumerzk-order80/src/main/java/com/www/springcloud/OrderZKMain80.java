package com.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author www
 * @creat 2021/2/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderZKMain80.class, args);
      }

}
