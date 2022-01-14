package guru.springframework.sfgdependencyinjection.controllers;

import guru.springframework.sfgdependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
