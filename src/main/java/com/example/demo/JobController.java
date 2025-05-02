package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping
    public Iterable<Job> index() {
        return jobRepository.findAll();
    }

    @PostMapping
    public Job newJob(@RequestBody Job newJob){
        return jobRepository.save(newJob);
    }

}
