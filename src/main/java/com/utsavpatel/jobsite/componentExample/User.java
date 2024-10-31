package com.utsavpatel.jobsite.componentExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Person person;

    public User(){
        System.out.println("User is init");
    }
}
