package com.example.directpay.jobrunrdemo.controllers;

import com.example.directpay.jobrunrdemo.services.SimpleJobService;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController {

    @Autowired
    private JobScheduler jobScheduler;

    @Autowired
    private SimpleJobService simpleJobService;

    @GetMapping
    public String Hello(){
        jobScheduler.enqueue(() -> simpleJobService.reversalKeeper());
        return "job's done";
    }
}
