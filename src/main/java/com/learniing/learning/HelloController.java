package com.learniing.learning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
    @RequestMapping(path = "/hello")
    public String hello() {
        return "Hello word word";
    }

    @RequestMapping(path = "/name")
    public String getName() {
        return new String("fode oulare");
    }
    
}
