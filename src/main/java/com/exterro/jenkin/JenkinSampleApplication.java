package com.exterro.jenkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinSampleApplication {
	public static Logger logger = LoggerFactory.getLogger(JenkinSampleApplication.class);
	
	public static void main(String[] args) {
		logger.info("In Sample Jenkins application executed");
		logger.info("In Sample Jenkins application executed - Third Commit");
		SpringApplication.run(JenkinSampleApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		logger.info("In Sample Jenkins application started - Second Commit");
		logger.info("In Sample Jenkins application started");
	}

}
