package com.www.springcloud.service;

import com.www.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author www
 * @creat 2021/2/2
 */
public interface PaymentService {
    public int created(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
