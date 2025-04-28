package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @GetMapping("/")
    public List<Job> index() {
        Job job1 = new Job();
        job1.id = 123;
        job1.companyName = "company 1";
        job1.appliedDate = LocalDate.now();
        job1.status=JobStatus.IN_PROGRESS;


        Job job12 = new Job();
        job12.id = 12223;
        job12.companyName = "company 22";
        job12.appliedDate = LocalDate.now();
        job12.status=JobStatus.NOT_STARTED;

        ArrayList<Job> jobs = new ArrayList<>();

        jobs.add(job1);
        jobs.add(job12);
        return jobs;
    }
}
