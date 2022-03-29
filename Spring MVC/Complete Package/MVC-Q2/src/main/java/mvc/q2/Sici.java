package mvc.q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sici {

	@RequestMapping(value = "/simpleInterest", method = RequestMethod.POST)
	public ModelAndView simpleInterest(@ModelAttribute("SI") SimpleInterestController simpleInterest) {
		ModelAndView view = new ModelAndView("Caluculate");
		double SimpleIntrest = (simpleInterest.principalAmount * (simpleInterest.interestRate / 100 / 12)
				* (simpleInterest.time * 12));
		view.addObject("Simple Intreset", SimpleIntrest);
		return view;
	}

	/*
	 * public static double compoundInterest(double principalAmount,int time,double
	 * interestRate){ double CompundInterest =
	 * (Math.pow(principalAmount*(1+(interestRate/100/12)),(time*12))-
	 * principalAmount); return CompundInterest; }
	 */

}
