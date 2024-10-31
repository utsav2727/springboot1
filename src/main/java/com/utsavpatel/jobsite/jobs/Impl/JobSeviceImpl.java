package com.utsavpatel.jobsite.jobs.Impl;

import com.utsavpatel.jobsite.jobs.Job;
import com.utsavpatel.jobsite.jobs.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class JobSeviceImpl implements JobService {

    private List<Job> jobList = new ArrayList<>();

    @Override
    public List<Job> getAll() {
        return jobList;
    }

    @Override
    public Job getJobById(long id) {
        for(Job item:jobList){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    @Override
    public void createJob(Job job) {
        jobList.add(job);
    }

    @Override
    public Job updateJob(long id, Job job) {
        for(Job item:jobList){
            if(item.getId() == id){
                item.setTitle(job.getTitle());
                item.setDesc(job.getDesc());
                item.setSalary(job.getSalary());
                return item;
            }
        }
        return null;
    }

    @Override
    public boolean deleteJob(long id) {

        Iterator<Job> iterator = jobList.iterator();
        while(iterator.hasNext()){
            Job currentJob = iterator.next();
            if(currentJob.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
