package com.ntimes.trace2.api;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TraceApi {

    private final Logger logger = Logger.getLogger(getClass());
    @RequestMapping("/trace-2")
    public String trace(){
        logger.info("===<call trace-2>===");
        return "trace-2";
    }
}
