package hambir.naket.sfgdi.controller;

import hambir.naket.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedDepInjection {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void Greet() {
        System.out.println("Setter based dependency injection!!");
        System.out.println(greetingService.sayGreeting());
    }


}
