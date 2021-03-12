package com.www.springcloud.controller;

import com.www.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/6 16:33
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = {"/payment/hystrix/ok/{id}"})
    public String paymentInfo_OK(@PathVariable(value = "id") Integer id) {
        String result = paymentService.paymentInfo_OK(id);
        log.info("*******result:" + result);
        return result;
    }

    @GetMapping({"/payment/hystrix/time_out/{id}"})
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("*******result:" + result);
        return result;
    }

    //====服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("****result: "+result);
        return result;
    }
}
