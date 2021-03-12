package com.www.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author www
 * @version 1.0
 * @create 2021/3/2 13:50
 */
@Component
public class PaymentFallbackservice implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackservice fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackservice fall back paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
