package com.utsavpatel.jobsite.jobs;

import java.util.List;

public interface JobService {

    public List<Job> getAll();
    public Job getJobById(long id);
    public void createJob(Job job);
    public Job updateJob(long id, Job job);
    public boolean deleteJob(long id);

}
