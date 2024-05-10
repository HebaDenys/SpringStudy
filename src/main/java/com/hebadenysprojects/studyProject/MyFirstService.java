package com.hebadenysprojects.studyProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {



//    @Autowired
//    @Qualifier("bean1")
//    private FirstClass firstClass;

    private FirstClass firstClass;
    private Environment environment;

    @Autowired
    public void injectDependencies(
           @Qualifier("bean2") FirstClass firstClass
    ){
      this.firstClass = firstClass;
    }


//    private final FirstClass firstClass;

//    @Autowired
//    public MyFirstService(
////            @Qualifier("bean2")
//            FirstClass firstClass) {
//        this.firstClass = firstClass;
//    }

    public String tellAStory(){
            return STR."the dependency is saying \{firstClass.sayHello()}";
    }
    public String getJavaVersion(){
            return STR."The java Version we are using is --> \{environment.getProperty("java.version")}";
    }
    public String getOsVersion(){
            return STR."The os name we are using is --> \{environment.getProperty("os.name")}";
    }
    public String getCustomProperty(){
            return STR."The os name we are using is --> \{environment.getProperty("my.custom.property")}";
    }

@Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
