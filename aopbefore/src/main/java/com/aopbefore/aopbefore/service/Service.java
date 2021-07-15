package com.aopbefore.aopbefore.service;

import com.aopbefore.aopbefore.sample.Sample;

@org.springframework.stereotype.Service
public class Service {
    public Sample method1(String test)
    {
        Sample sample = new Sample();
        sample.setName(test);
        System.out.println("vhdh");
        return sample;

    }
}
