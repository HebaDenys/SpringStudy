package com.hebadenysprojects.studyProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyProjectApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(StudyProjectApplication.class, args);


		FirstClass firstClass = context.getBean("firstClass",FirstClass.class);
		System.out.println(firstClass.sayHello());

		SecondClass secondClass = context.getBean("renamedBean",SecondClass.class);
		System.out.println(secondClass.sayByeBye());

		MyFirstService myFirstService = context.getBean(MyFirstService.class);

		System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getJavaVersion());
		System.out.println(myFirstService.getOsVersion());
		System.out.println(myFirstService.getCustomProperty());

	}

}
