package mpy.springcloud.controller;

import mpy.springcloud.pojo.CommonResult;
import mpy.springcloud.pojo.Payment;
import mpy.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerFeignController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/feign/payment/get/{id}")
    public CommonResult<Payment> consumerFeign(@PathVariable("id")Long id){
        return paymentService.getPaymentById(id);
    }

}
