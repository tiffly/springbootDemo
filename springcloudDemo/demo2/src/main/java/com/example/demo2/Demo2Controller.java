package com.example.demo2;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class Demo2Controller {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "/router",method = RequestMethod.GET)
    public String router(){
        RestTemplate restTemplate = getRestTemplate();
        String name = restTemplate.getForObject("http://demo1:8080/person",String.class);
        return name;
    }
}
