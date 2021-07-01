package com.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author www
 * @version 1.0
 * @create 2021/5/27 16:28
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClientMain3366.class, args);
      }

}
