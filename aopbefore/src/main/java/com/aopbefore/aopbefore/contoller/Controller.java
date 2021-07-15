package com.aopbefore.aopbefore.contoller;

import com.aopbefore.aopbefore.sample.Sample;
import com.aopbefore.aopbefore.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Service service;
    @GetMapping(path = "hello")
    public String messsage(){
    return "helo";}

    @GetMapping(path = "/name")
    public Sample method1(){
        return service.method1("hgdhg");
    }

}
