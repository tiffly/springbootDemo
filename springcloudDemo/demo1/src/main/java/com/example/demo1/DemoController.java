package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public String findName(){
        String name = "success";
        return name;
    }
}
