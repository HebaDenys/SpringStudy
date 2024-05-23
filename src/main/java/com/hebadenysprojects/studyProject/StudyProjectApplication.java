package com.hebadenysprojects.studyProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Main application class for the Study Project.
 */
@SpringBootApplication
public class StudyProjectApplication {

    public static void main(String[] args) {
        // Start the Spring application and retrieve the application context
        ApplicationContext context = SpringApplication.run(StudyProjectApplication.class, args);

        // Access and use the FirstClass bean
        FirstClass primaryFirstClass = context.getBean(FirstClass.class);
        System.out.println("Primary FirstClass says: " + primaryFirstClass.greet());

        // Access and use the renamed SecondClass bean
        SecondClass secondClass = context.getBean("customNamedSecondClass", SecondClass.class);
        System.out.println("SecondClass says: " + secondClass.farewell());

        // Access and use the MyFirstService bean
        MyFirstService myFirstService = context.getBean(MyFirstService.class);
        System.out.println("MyFirstService tells: " + myFirstService.tellStory());
        System.out.println("Custom Property: " + myFirstService.getCustomProperty());
        System.out.println("Numeric Property: " + myFirstService.getNumericProperty());
    }
}
