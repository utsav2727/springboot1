package com.utsavpatel.jobsite.sample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SampleController {

    List<SampleUser> cachedArray= new ArrayList<>();

    @Autowired
    SampleService sampleService;


    @GetMapping("/search")
    public List<SampleUser> getData(@RequestParam String username, @RequestParam String password){

        SampleUser sampleUser = new SampleUser();

        sampleUser.setUsername(username);
        sampleUser.setPassword(password);
        cachedArray.add(sampleUser);
        System.out.println(cachedArray.toString());

        return cachedArray;
    }


    @GetMapping("/async")
    public void testAsync(){
        System.out.println(" testAsync controller " +Thread.currentThread().getName());
        sampleService.testAsync();
    }



}
