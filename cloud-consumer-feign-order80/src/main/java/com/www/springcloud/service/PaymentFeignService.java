package com.www.springcloud.service;

import com.www.springcloud.entities.CommonResult;
import com.www.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author www
 * @creat 2021/2/6
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = {"/payment/get/{id}"})
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = {"/payment/feign/timeout"})
    public String paymentFeignTimeout();
}
