package com.cloud.consumer.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2024/9/14 10:15
 */
@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-provider-service}")
    private String serviceUrl;

    @RequestMapping(value = "/getInfo")
    public String getInfo() {
        return restTemplate.getForObject(serviceUrl + "/provider/config", String.class);
    }
}
