package com.cloud.feign.consumer.controller;

import com.cloud.feign.consumer.service.FeignInterface;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2024/9/14 11:00
 */
@RestController
public class ConfigController {

    @Resource
    FeignInterface feignInterface;

    @RequestMapping("/getInfo")
    public String getConfig(){
        return feignInterface.getConfig();
    }
}
