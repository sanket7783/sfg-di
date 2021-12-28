package hambir.naket.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World !!!";
    }
}
