package com.cloud.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2024/9/14 10:56
 */
@FeignClient(value = "provider")
public interface FeignInterface {

    @GetMapping(value = "/provider/config")
    String getConfig();

}
