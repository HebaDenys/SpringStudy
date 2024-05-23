package com.hebadenysprojects.studyProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        System.out.println("MyFirstService Storya: ");
        return "Hello, World!";
    }
}
