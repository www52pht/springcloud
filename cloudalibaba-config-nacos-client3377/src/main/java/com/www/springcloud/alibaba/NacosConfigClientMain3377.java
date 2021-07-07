package com.www.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author www
 * @version 1.0
 * @create 2021/7/7 16:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
     public static void main(String[] args) {
           SpringApplication.run(NacosConfigClientMain3377.class, args);
      }

}
