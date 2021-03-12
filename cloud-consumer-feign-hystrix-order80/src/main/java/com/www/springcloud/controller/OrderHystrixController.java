package com.www.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.www.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/6 17:21
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = {"/consumer/payment/hystrix/ok/{id}"})
    public String paymentInfo_OK(@PathVariable(value = "id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }


    @GetMapping({"/consumer/payment/hystrix/time_out/{id}"})
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
//    })
    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
//        int age = 10 / 0;
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        return result;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "我是消费者80，对方支付系统繁忙请10秒钟后再试或者自已运行出错请检查自己，o(╥﹏╥)o";
    }

    //下面是全局fallback
    // 配置全局兜底方案不能有形参的出现
    public String payment_Global_FallbackMethod() {
        return "Global异常处理信息，请稍后再尝试";
    }

}
