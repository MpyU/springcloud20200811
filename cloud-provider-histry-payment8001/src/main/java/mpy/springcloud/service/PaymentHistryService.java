package mpy.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentHistryService {

    public String histry_returnNormal(Long id){
        return "调用成功.....id = "+id+".......success!!!!";
    }

    @HystrixCommand(fallbackMethod = "histry_returnTimeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String histry_returnTimeout(Integer id){
        int time = 2;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "超时.......time = "+time;
//        return "id = "+id;
    }
    public String histry_returnTimeoutHandler(Integer id)
    {
        return "----------------加载失败，已超时----------------id = "+id+"----------";
    }
}
