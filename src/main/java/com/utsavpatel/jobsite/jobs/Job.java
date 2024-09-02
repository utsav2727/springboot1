package com.utsavpatel.jobsite.jobs;

public class Job {
    private long id;
    private String title;
    private String desc;
    private int salary;

    public Job(long id, int salary, String desc, String title) {
        this.id = id;
        this.salary = salary;
        this.desc = desc;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
