package com.lmy.Springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    public String application;

    @Value("${eureka.client.service-url.defaultZone}")
    public String eurekaServer;

    @Value("${server.port}")
    public String port;

    @RequestMapping("/config")
    public String getConfig(){
        return "application" + application +
                "eurekaServer" + eurekaServer +
                "port" + port;
    }

}
