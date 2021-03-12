package com.www.springcloud.dao;

import com.www.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author www
 * @creat 2021/2/2
 */
@Mapper
public interface PaymentDao {
    public int created(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
