package com.hebadenysprojects.studyProject;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {

    private String myVar;

    public FirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return STR."Hello Guys ====> myVar = \{myVar}";
    }
}
