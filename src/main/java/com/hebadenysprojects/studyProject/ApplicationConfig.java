package com.hebadenysprojects.studyProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean("renamedBean")
    public SecondClass secondClass(){
        return new SecondClass();
    }


    @Bean
    @Qualifier("bean2")
    public FirstClass secondBean(){
        return new FirstClass("Second Bean");
    }
    @Bean
    @Qualifier("bean3")
    public FirstClass firstClass(){
        return new FirstClass("First Bean Var");
    }
    @Bean
    @Primary
    public FirstClass thirdClass(){
        return new FirstClass("Third Bean Var");
    }

}
