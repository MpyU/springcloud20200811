package mpy.springcloud.controller;

import mpy.springcloud.service.PaymentHistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentHistryController {

    @Autowired
    private PaymentHistryService paymentHystrixService;

    @GetMapping("/hystrix/payment/normal/{id}")
    public String hystrixNormal(@PathVariable("id") Long id){
        return paymentHystrixService.histry_returnNormal(id);
    }


    @GetMapping("/hystrix/payment/timeout/{id}")
    public String hystrixTimeout(@PathVariable("id") Integer id){
        return paymentHystrixService.histry_returnTimeout(id);
    }
}
