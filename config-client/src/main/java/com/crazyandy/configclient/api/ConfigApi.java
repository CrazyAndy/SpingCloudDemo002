package com.crazyandy.configclient.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:sunhu
 * @Description:
 * @Date Created in 2018/1/30 14:32
 * @Modified By:
 */
@RefreshScope
@RestController
public class ConfigApi {
    @Value("${from}")
    private String from;
    @RequestMapping("/from")
    public String from(){
        System.out.println(1);
        return this.from;
    }
}
