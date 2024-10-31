package com.utsavpatel.jobsite.jobs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getJobs(){

        return new ResponseEntity<>(jobService.getAll(), HttpStatus.OK);
    }


    @PostMapping("/jobs")
    public ResponseEntity<String> postJobs(@RequestBody Job job){
        jobService.createJob(job);
        return new ResponseEntity<>("Job added successfully",HttpStatus.OK);
    }


    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable long id){
        Job job = jobService.getJobById(id);
        if(job != null){
            return new ResponseEntity<>(job, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/jobs/{id}")
    public ResponseEntity<Job> updateById(@PathVariable long id, @RequestBody Job job){
        Job updatedJob = jobService.updateJob(id, job);
        if(updatedJob != null)
            return new ResponseEntity<>(updatedJob, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id){
        boolean isDeleted = jobService.deleteJob(id);
        if(isDeleted){
            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
