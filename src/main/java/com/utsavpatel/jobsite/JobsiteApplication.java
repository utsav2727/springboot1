package com.utsavpatel.jobsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class JobsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsiteApplication.class, args);
	}

}
