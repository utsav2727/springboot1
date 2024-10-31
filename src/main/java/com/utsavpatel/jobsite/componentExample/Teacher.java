package com.utsavpatel.jobsite.componentExample;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Teacher {

    Teacher(){
        System.out.println("Teacher init");
    }
}
