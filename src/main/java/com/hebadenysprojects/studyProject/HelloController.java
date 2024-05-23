package com.hebadenysprojects.studyProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple REST controller to handle HTTP requests.
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String greet() {
        System.out.println("Accessing the root endpoint.");
        return "Hello, World!";
    }
}
