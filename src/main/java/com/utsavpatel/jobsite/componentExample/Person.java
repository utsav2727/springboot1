package com.utsavpatel.jobsite.componentExample;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Person {

    public Person(){
        System.out.println("person init");
    }
}
