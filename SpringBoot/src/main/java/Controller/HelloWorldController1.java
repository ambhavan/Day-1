package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
 
public class HelloWorldController1 {
@GetMapping("/hello")
	public String helloworld() {
		return "Hello world!";
	}
}