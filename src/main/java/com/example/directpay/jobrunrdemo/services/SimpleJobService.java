package com.example.directpay.jobrunrdemo.services;

import org.jobrunr.jobs.annotations.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SimpleJobService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleJobService.class);


    @Job(name = "Reversal Keeper", retries = 1)
    public void reversalKeeper(){
        LOGGER.info("Job Reversal Keeper");
            /*try{

            }catch (Exception e){
                e.printStackTrace();
            }*/

        }
    
}
