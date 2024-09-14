package com.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2024/9/14 9:53
 */
@RestController
@RefreshScope
public class FetchConfigController {
    @Value("${test.config}")
    private String config;

    @RequestMapping(value = "/provider/config")
    public String get() {
        return config;
    }
}
