package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2020/5/12
 *
 * @author lixuanfeng
 */
@Configuration
public class BeanConfig {

    /**
     * RestTemplate 该类是spring官方提供的，不是真正的spring cloud调用
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}