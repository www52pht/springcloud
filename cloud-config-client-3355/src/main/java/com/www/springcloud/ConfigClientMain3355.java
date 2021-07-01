package com.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @author www
* @create 2021/5/27 15:44
* @version 1.0
*/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClientMain3355.class, args);
      }

}

