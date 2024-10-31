package com.utsavpatel.jobsite.componentExample;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Person2 {

    public Person2(){
        System.out.println("person2 init");
    }
}
