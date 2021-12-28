package hambir.naket.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class controller {

    public String SayGreeting() {
        System.out.println("Hello World!");
        return "Hello World";
    }

}
