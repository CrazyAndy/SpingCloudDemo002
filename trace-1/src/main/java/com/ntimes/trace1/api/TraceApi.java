package com.ntimes.trace1.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TraceApi {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/trace")
    public String trace(){
        System.out.println("===call trace-1===");
        return restTemplate.getForEntity("http://trace-2/trace-2",String.class).getBody();
    }

}
