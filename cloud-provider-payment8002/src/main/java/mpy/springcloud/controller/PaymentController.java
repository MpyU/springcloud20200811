package mpy.springcloud.controller;

import mpy.springcloud.pojo.CommonResult;
import mpy.springcloud.pojo.Payment;
import mpy.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult<>(200,"查询成功, serverPort: "+serverPort,payment);
        }else{
            return new CommonResult<>(444,"无此数据，id: "+id,null);
        }
    }

    @PostMapping("/payment/add")
    public CommonResult<Integer> addPayment(@RequestBody Payment payment){
        int result = paymentService.addPayment(payment);
        if(result > 0){
            return new CommonResult<>(200,"添加成功, serverPort: "+serverPort,result);
        }else{
            return new CommonResult<>(444,"添加失败！！！",null);
        }
    }
}
