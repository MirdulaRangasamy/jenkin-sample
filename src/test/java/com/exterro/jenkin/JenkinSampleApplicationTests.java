package com.exterro.jenkin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinSampleApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(JenkinSampleApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("In Sample Jenkins application started - Test case Running...");
		Assertions.assertTrue(true);
	}

}
