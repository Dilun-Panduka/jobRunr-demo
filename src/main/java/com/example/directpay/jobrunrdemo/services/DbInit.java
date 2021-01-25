package com.example.directpay.jobrunrdemo.services;

import java.util.Calendar;

import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.scheduling.cron.Cron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DbInit implements CommandLineRunner{

    @Autowired
    private JobScheduler jobScheduler;

    @Autowired
    private SimpleJobService simpleJobService;


    @Override
    public void run(String... args) {

         /*if(alreadySetup)
             return;
         alreadySetup = true;*/

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        long timeTillMidnight = (c.getTimeInMillis()-System.currentTimeMillis());

//        jobScheduler.scheduleRecurrently(SimpleJobService::reversalKeeper, Cron.minutely());
        jobScheduler.scheduleRecurrently(()->simpleJobService.reversalKeeper(), Cron.minutely());
//        jobScheduler.scheduleRecurrently(() -> jobService.reversalKeeper(), Cron.every5minutes());
//        jobScheduler.schedule(()->{
//            jobScheduler.scheduleRecurrently(() -> jobService.settlementKeeper(), Cron.daily(0));
//        }, Instant.now().plusMillis(timeTillMidnight));

    }
}
