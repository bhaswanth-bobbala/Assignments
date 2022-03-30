/*
 * Create a RESTful web service that returns state, city and country information when user passes
zipcode. You can send state, city and country information in JSON format.
Sample Input: 99501
Sample output: {"state": "AK", City: "ANCHORAGE", "country: "US"}
 */

package rest.ques3;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Zipcode {
	DetailsRepo repo = new DetailsRepo();

	@RequestMapping(value = "/zipcodes", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public List<ZipcodeDetails> zipcodes() {
		return repo.getZipcodes();
	}

	@RequestMapping(value = "/zipcode/{zipcode}", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ZipcodeDetails zipcode(@PathVariable("zipcode") long zip) {
		return repo.getZipcodeDetails(zip);

	}

}
