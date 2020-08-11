package mpy.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "PROVIDER-PAYMENT-SERVICE",fallback = PaymentHystrixFallbackService.class)
public interface PaymentHystrixService {
    @GetMapping("/hystrix/payment/timeout/{id}")
    String paymentInfo_TimeOut(Integer id);

    @GetMapping("/hystrix/payment/normal/{id}")
    String paymentInfo_Normal(Long id);
}
