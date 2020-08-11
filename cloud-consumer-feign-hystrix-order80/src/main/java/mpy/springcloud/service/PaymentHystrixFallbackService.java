package mpy.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "8001服务宕机了------paymentInfo_TimeOut";
    }

    @Override
    public String paymentInfo_Normal(Long id) {
        return "调用8001服务宕机了------paymentInfo_Normal";
    }
}
