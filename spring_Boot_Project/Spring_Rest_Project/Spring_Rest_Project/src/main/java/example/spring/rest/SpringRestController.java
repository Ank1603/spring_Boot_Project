package example.spring.rest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Combines @Controller and @Responsebody
public class SpringRestController {

	@GetMapping("/doGreet")
	public String getGreetingData() {
		return ""
				+ "hey all, Welcome to the world of Spring REST";
	}
	
	@GetMapping("/showGreeting")
	public Greeting getOneGreeting() {
		Greeting greetingObject = new Greeting("Happy New Year",LocalDate.of(2025,1,1));
		return greetingObject;
	}
	
	@GetMapping("/showAllGreetings")
	public Collection<Greeting>getAllGreetings(){
		Greeting greetingObject= new Greeting("Happy New Year",LocalDate.of(2025,1,1));
		Greeting greetingObject2= new Greeting("Bye Bye 2024",LocalDate.of(2024,12,31));
		Greeting greetingObject3= new Greeting("Merry Chritsmas",LocalDate.of(2024,12,25));
		Collection<Greeting>allGreetings = Arrays.asList(greetingObject,greetingObject2,greetingObject3);
		
		return allGreetings;
		
		
				
	}
}
