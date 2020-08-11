package mpy.springcloud.controller;

import mpy.springcloud.pojo.CommonResult;
import mpy.springcloud.pojo.Payment;
import mpy.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/payment/discovery")
    public Object discovery(){

        List<String> services = discoveryClient.getServices();
        for(String string : services){
            System.out.println("----------"+string+"-----------");
            List<ServiceInstance> instances = discoveryClient.getInstances(string);
            for(ServiceInstance instance:instances){
                System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
            }
        }


        return discoveryClient;
    }
}
