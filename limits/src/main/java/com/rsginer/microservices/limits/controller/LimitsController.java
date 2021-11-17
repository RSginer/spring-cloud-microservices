package com.rsginer.microservices.limits.controller;

import com.rsginer.microservices.limits.bean.Limits;
import com.rsginer.microservices.limits.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(config.getMinimum(), config.getMaximum());
    }

}
