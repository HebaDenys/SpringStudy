package com.hebadenysprojects.studyProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Configuration class for defining Spring beans.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public String primaryInstanceIdentifier() {
        return "Primary Bean Instance";
    }

    @Bean("customNamedSecondClass")
    public SecondClass secondClass() {
        return new SecondClass();
    }

    @Bean
    @Qualifier("secondaryBean")
    public FirstClass secondaryFirstClass() {
        return new FirstClass("Secondary Bean Instance");
    }

    @Bean
    @Qualifier("tertiaryBean")
    public FirstClass tertiaryFirstClass() {
        return new FirstClass("Tertiary Bean Instance");
    }

    @Bean
    @Primary
    public FirstClass primaryFirstClass(String primaryInstanceIdentifier) {
        return new FirstClass(primaryInstanceIdentifier);
    }
}
