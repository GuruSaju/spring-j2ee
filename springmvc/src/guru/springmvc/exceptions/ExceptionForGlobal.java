package guru.springmvc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author Srisarguru
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such ID") //404
public class ExceptionForGlobal extends RuntimeException {
	
	public ExceptionForGlobal(String someId){
		super (someId + "not found");
	}
}
