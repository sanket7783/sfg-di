package hambir.naket.sfgdi.controller;

import hambir.naket.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedDepInjection {

    private GreetingService greetingService;

    public ConstructorBasedDepInjection(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void Greet() {
        System.out.println(greetingService.sayGreeting());
    }
}
