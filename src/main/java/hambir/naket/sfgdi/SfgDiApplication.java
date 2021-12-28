package hambir.naket.sfgdi;

import hambir.naket.sfgdi.controller.ConstructorBasedDepInjection;
import hambir.naket.sfgdi.controller.PropertyBasedDepInjection;
import hambir.naket.sfgdi.controller.SetterBasedDepInjection;
import hambir.naket.sfgdi.controller.controller;
import hambir.naket.sfgdi.services.GreetingService;
import hambir.naket.sfgdi.services.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		controller ctlr = (controller) ctx.getBean("controller");
//		System.out.println(ctlr.SayGreeting());
		PropertyBasedDepInjection cltr1 = (PropertyBasedDepInjection) ctx.getBean("propertyBasedDepInjection");
		cltr1.greetingService = (GreetingService) ctx.getBean("greetingServiceImpl");
		cltr1.Greet();

		System.out.println("Setter Based injection");
		SetterBasedDepInjection cltr2 = (SetterBasedDepInjection) ctx.getBean("setterBasedDepInjection");
		cltr2.setGreetingService((GreetingService) ctx.getBean("greetingServiceImpl"));
		cltr2.Greet();

		System.out.println("Constructor Based Dependency Injection");
		ConstructorBasedDepInjection ctlr3 = new ConstructorBasedDepInjection(new GreetingServiceImpl());
		ctlr3.Greet();


	}

}
