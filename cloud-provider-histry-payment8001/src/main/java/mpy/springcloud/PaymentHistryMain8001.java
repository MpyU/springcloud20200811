package mpy.springcloud;

import mpy.springcloud.pojo.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker
@EnableHystrix
public class PaymentHistryMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHistryMain8001.class,args);
    }
}
