package com.ouyanglol.snowflake.controller;

import com.ouyanglol.snowflake.service.SnowflakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: dnouyang
 * @Date: 2019/4/15 16:39
 */
@RestController
@RequestMapping("leaf")
public class LeafController {
    @Autowired
    private SnowflakeService snowflakeService;

    @GetMapping("get/{key}")
    public String get(@PathVariable("key") String key) {
        return snowflakeService.get(key);
    }
}
