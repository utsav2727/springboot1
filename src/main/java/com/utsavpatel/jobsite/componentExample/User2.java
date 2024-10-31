package com.utsavpatel.jobsite.componentExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User2 {

    Person2 person2;
    Teacher teacher;


    public User2(Teacher teacher){
        System.out.println("User2 constructor start");
            this.teacher = teacher;
        System.out.println("User2 consturctore end");
    }

    @Autowired
    public User2(Person2 person2){
        System.out.println("person2");
        this.person2 = person2;
    }
}
