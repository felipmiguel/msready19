package com.msready19.raist213.demoseapp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApi {

    @RequestMapping(path = "/echo", method = RequestMethod.POST)
    String echo(@RequestBody String source) {
        return "Spring echo: " + source;
    }
}