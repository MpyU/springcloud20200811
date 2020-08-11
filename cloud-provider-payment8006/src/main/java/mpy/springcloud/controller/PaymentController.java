package mpy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("/payment/consul")
    public String paymentConsul(){
        return "this is consul service, port is "+serverPort+"---"+ UUID.randomUUID().toString();
    }
}
