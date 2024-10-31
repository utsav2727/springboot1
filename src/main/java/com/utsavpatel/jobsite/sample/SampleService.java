package com.utsavpatel.jobsite.sample;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SampleService {


    @Async
    public void testAsync(){
        System.out.println("testing async service call");
        System.out.println(Thread.currentThread().getName());
    }
}
