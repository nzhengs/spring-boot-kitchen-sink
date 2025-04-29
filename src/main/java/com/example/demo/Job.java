package com.example.demo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String companyName;
    public String role;
    public LocalDate appliedDate;

    @Enumerated(EnumType.STRING)
    public JobStatus status;
}
