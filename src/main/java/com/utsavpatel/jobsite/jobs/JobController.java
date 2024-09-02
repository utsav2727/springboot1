package com.utsavpatel.jobsite.jobs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private List<Job> jobList = new ArrayList<>();

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getJobs(){
        return new ResponseEntity<>(jobList, HttpStatus.OK);
    }


    @PostMapping("/jobs")
    public ResponseEntity<String> postJobs(@RequestBody Job job){
        jobList.add(job);
        return new ResponseEntity<>("Job added successfully",HttpStatus.OK);
    }


    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable long id){
        for(Job item:jobList){
            if(item.getId() == id){
                return new ResponseEntity<>(item, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/jobs/{id}")
    public ResponseEntity<Job> updateById(@PathVariable long id, @RequestBody Job job){
        for(Job item:jobList){
            if(item.getId() == id){
                item.setTitle(job.getTitle());
                item.setDesc(job.getDesc());
                item.setSalary(job.getSalary());
                return new ResponseEntity<>(item, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
