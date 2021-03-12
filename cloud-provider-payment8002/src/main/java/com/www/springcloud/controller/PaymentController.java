package com.www.springcloud.controller;

import com.www.springcloud.entities.CommonResult;
import com.www.springcloud.entities.Payment;
import com.www.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author www
 * @creat 2021/2/2
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = {"/payment/create"})
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.created(payment);
        log.info("****插入结果:" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPost:"+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败！", null);
        }
    }
    @GetMapping(value = {"/payment/get/{id}"})
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果:" + payment);

        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPost:"+serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询的ID"+id, null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
