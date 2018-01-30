package com.ntimes.trace1.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.apache.log4j.Logger;

@RestController
public class TraceApi {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/trace")
    public String trace(){
        logger.info("===call trace-1===");
        return restTemplate.getForEntity("http://trace-2/trace-2",String.class).getBody();
    }

}
