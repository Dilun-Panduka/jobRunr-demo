package com.example.directpay.jobrunrdemo.services;

import org.jobrunr.jobs.annotations.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleJobService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleJobService.class);

    @Autowired
    private CommonService commonService;

    @Job(name = "Reversal Keeper", retries = 1)
    public void reversalKeeper(){
        LOGGER.info("Job Reversal Keeper");
            LOGGER.info(commonService.go());
            LOGGER.info(String.valueOf(commonService.calculate(2,3)));
        }

    
}
