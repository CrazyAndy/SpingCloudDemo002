package com.ntimes.trace2.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceApi {

    @RequestMapping("/trace-2")
    public String trace(){
        return "trace-2";
    }
}
