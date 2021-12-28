package hambir.naket.sfgdi.controller;

import hambir.naket.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyBasedDepInjection {

    public GreetingService greetingService;

    public void Greet() {
        System.out.println("Property Based Dependency Injection!!");
        System.out.println(greetingService.sayGreeting());
    }
}
