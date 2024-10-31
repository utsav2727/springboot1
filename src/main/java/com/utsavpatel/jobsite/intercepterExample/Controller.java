package com.utsavpatel.jobsite.intercepterExample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intercepter")
public class Controller {


    @GetMapping("/get")
    public void getData(){
        System.out.println("reached to controller");
    }
}
