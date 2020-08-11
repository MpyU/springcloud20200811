package mpy.springcloud.service;

import mpy.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    Payment getPaymentById(@Param("id") Long id);
    int addPayment(Payment payment);
}
