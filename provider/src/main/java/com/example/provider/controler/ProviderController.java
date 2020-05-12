package com.example.provider.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2020/5/12
 *
 * @author lixuanfeng
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @RequestMapping("/hello")
    public String hello(){
        return "spring cloud provider-01 hello world";
    }
}