package guru.springframework.sfgdependencyinjection.config;

import guru.springframework.sfgdependencyinjection.services.ConstructorGreetingService;
import guru.springframework.sfgdependencyinjection.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdependencyinjection.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
