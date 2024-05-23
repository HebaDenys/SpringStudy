package com.hebadenysprojects.studyProject;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * A simple Spring component representing a first class bean.
 */
@Component
public class FirstClass {

    private final String instanceIdentifier;

    public FirstClass(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
    }

    public String greet() {
        return "Hello, this is " + instanceIdentifier;
    }
}
