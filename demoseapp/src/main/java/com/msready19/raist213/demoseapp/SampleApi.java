package com.msready19.raist213.demoseapp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApi {

    @RequestMapping(path = "/", method = RequestMethod.POST)
    String echo(@RequestBody String source) {
        return source;
    }

    @RequestMapping(path = "/reverse", method=RequestMethod.GET)
    String reverse(@RequestParam String source) {
        return source;
    }
}