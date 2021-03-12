package com.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author www
 * @creat 2021/2/3
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
     public static void main(String[] args) {
           SpringApplication.run(EurekaMain7001.class, args);
      }

}
