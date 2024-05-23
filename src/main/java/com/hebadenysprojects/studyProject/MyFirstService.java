package com.hebadenysprojects.studyProject;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

/**
 * Service class demonstrating dependency injection and property sourcing.
 */
@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom2.properties")
})
public class MyFirstService {

    private final FirstClass firstClassDependency;

    @Getter
    @Value("${my.prop}")
    private String customProperty;

    @Getter
    @Value("${my.custom.property}")
    private int numericProperty;

    @Autowired
    public MyFirstService(@Qualifier("secondaryBean") FirstClass firstClassDependency) {
        this.firstClassDependency = firstClassDependency;
    }

    public String tellStory() {
        return "FirstClass says: " + firstClassDependency.greet();
    }

}
