package com.www.springcloud.service.impl;

import com.www.springcloud.dao.PaymentDao;
import com.www.springcloud.entities.Payment;
import com.www.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author www
 * @creat 2021/2/2
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int created(Payment payment){
        return paymentDao.created(payment);
    };

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }


}
