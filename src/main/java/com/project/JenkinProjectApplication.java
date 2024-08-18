package com.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinProjectApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinProjectApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Post Construct logging...!");
	}
	
	
	public static void main(String[] args) {
		logger.info("inside main springboot method logging...!");
		SpringApplication.run(JenkinProjectApplication.class, args);
	}

}
