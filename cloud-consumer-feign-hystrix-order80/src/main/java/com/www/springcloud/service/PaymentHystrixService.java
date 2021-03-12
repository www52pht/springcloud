package com.www.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/6 17:18
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackservice.class)
public interface PaymentHystrixService {
    @GetMapping(value = {"/payment/hystrix/ok/{id}"})
    public String paymentInfo_OK(@PathVariable(value = "id") Integer id);

    @GetMapping({"/payment/hystrix/time_out/{id}"})
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);

}
