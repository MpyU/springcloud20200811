package mpy.springcloud.dao;

import mpy.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    Payment getPaymentById(@Param("id")Long id);
    int addPayment(Payment payment);
}
