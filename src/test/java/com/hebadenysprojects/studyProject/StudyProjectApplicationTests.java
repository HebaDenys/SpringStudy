package com.hebadenysprojects.studyProject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StudyProjectApplicationTests {

	@Autowired
	private MyFirstService myFirstService;

	@Test
	void contextLoads() {
		assertNotNull(myFirstService);
	}

}
