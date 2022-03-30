/*
 * Create a RESTful web service that authenticates an user. User will specify his/her credentials i.e.
username and password. If username and password are correct, It should return "valid user"
message, else "Invalid user" message.
 */

package rest.ques2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> details(@RequestBody Credentials cread) {
		if (cread.getUsername().equals("Manindra952") && cread.getPassword().equals("Naga952"))
			return new ResponseEntity<String>("Valid User", HttpStatus.OK);
		else {
			return new ResponseEntity<String>("Invalid User", HttpStatus.OK);
		}
	}

}
