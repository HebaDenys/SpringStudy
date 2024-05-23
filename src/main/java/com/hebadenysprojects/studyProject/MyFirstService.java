package com.hebadenysprojects.studyProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

// Questa classe rappresenta il servizio principale dell'applicazione, MyFirstService.
// È annotato con @Service per indicare a Spring di gestirlo come un componente all'interno del contesto dell'applicazione.
// Questo significa che Spring sarà responsabile della creazione e della gestione delle istanze di questa classe.
@Service
// @PropertySources consente di specificare più file di proprietà da cui caricare le proprietà.
@PropertySources({@PropertySource("classpath:custom.properties"), @PropertySource("classpath:custom2.properties")})
public class MyFirstService {

    // Questo campo rappresenta una dipendenza di tipo FirstClass.
    private final FirstClass firstClass;

    // Le seguenti annotazioni @Value vengono utilizzate per iniettare valori di proprietà da file di configurazione esterni.
    // Questi valori sono configurati nei file custom.properties e custom2.properties.
    @Value("${my.prop}")
    private String myProp;
    @Value("${my.custom.property}")
    private int myProp2;

    // L'annotazione @Autowired indica a Spring di iniettare automaticamente un'istanza di FirstClass quando viene creato un'istanza di MyFirstService.
    // L'annotazione @Qualifier viene utilizzata per specificare quale bean di FirstClass deve essere iniettato, nel caso ci siano più implementazioni di FirstClass disponibili.
    @Autowired
    public MyFirstService(@Qualifier("bean2") FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    // Questo metodo restituisce una stringa che racconta una storia utilizzando il metodo sayHello() dell'istanza di FirstClass.
    public String tellAStory() {
        return "The dependency is saying: " + firstClass.sayHello();
    }

    // Questi metodi forniscono accesso alle proprietà configurate tramite le annotazioni @Value.
    // Restituiscono i valori delle proprietà recuperate dai file di configurazione.
    public String getMyProp() {
        return myProp;
    }

    public int getMyProp2() {
        return myProp2;
    }
}
