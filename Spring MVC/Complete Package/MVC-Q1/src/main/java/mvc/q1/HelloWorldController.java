package mvc.q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/print", method = RequestMethod.GET)
	public ModelAndView name() {
		ModelAndView view = new ModelAndView("index");
		return view;
	}

	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public ModelAndView display() {
		ModelAndView view = new ModelAndView("helloWorld");
		return view;
	}

}
