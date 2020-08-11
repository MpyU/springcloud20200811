package mpy.springcloud.service.impl;

import mpy.springcloud.dao.PaymentDao;
import mpy.springcloud.pojo.Payment;
import mpy.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }
}
