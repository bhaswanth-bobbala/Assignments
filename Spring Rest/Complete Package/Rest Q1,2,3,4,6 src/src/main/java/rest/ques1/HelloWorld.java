/*
 * Create a RESTful web service that returns "Hello World" message.
 */

package rest.ques1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	// using get method and hello-world URI
	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}

}
