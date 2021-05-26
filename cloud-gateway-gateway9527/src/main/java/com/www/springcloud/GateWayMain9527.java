package com.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author www
 * @version 1.0
 * @create 2021/5/26 11:13
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
     public static void main(String[] args) {
           SpringApplication.run(GateWayMain9527.class, args);
      }

}
