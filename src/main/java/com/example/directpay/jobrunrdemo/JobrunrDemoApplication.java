package com.example.directpay.jobrunrdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobrunrDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobrunrDemoApplication.class, args);
	}

	/*@Bean
	public JobScheduler initJobRunr(InMemoryStorageProvider inMemoryStorageProvider, JobActivator jobActivator){
		return JobRunr.configure().useStorageProvider(inMemoryStorageProvider).useJobActivator(jobActivator).useDefaultBackgroundJobServer().useDashboard().initialize();
	}*/
}
