package com.example.consumer.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2020/5/12
 *
 * @author lixuanfeng
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(){
        //调用spring cloud服务提供者提供的服务 调用远程服务的返回值类型
        return  restTemplate.getForEntity("http://springcloud-service-provider/provider/hello",String.class).getBody();
    }

}