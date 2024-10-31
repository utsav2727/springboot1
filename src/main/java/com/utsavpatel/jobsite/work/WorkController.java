package com.utsavpatel.jobsite.work;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class WorkController {

    @Autowired
    Work work;


    @PostMapping("/create")
    public String postMsg(){
        return "Utsav";
    }
}
