package com.hebadenysprojects.studyProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudyProjectApplication {

	public static void main(String[] args) {
		// Avvia l'applicazione Spring e ottiene il contesto dell'applicazione
		ApplicationContext context = SpringApplication.run(StudyProjectApplication.class, args);

		// Ottiene e utilizza il bean FirstClass
		FirstClass firstClass = context.getBean("firstClass", FirstClass.class);
		System.out.println("Message from FirstClass: " + firstClass.sayHello());

		// Ottiene e utilizza il bean SecondClass rinominato
		SecondClass secondClass = context.getBean("renamedBean", SecondClass.class);
		System.out.println("Message from SecondClass: " + secondClass.sayByeBye());

		// Ottiene e utilizza il servizio MyFirstService
		MyFirstService myFirstService = context.getBean(MyFirstService.class);
		System.out.println("MyFirstService Story: " + myFirstService.tellAStory());
		System.out.println("MyFirstService Property myProp: " + myFirstService.getMyProp());
		System.out.println("MyFirstService Property myProp2: " + myFirstService.getMyProp2());

		// L'applicazione è stata avviata con successo e tutte le componenti Spring sono state testate
	}
}
