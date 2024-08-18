package com.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinProjectApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinProjectApplication.class);
	
	
	@Test
	void contextLoads() {
		logger.info("Inside test class ....!");
		assertEquals(true, true);
	}

}
