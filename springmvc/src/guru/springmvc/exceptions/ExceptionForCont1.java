package guru.springmvc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author Srisarguru
 * Application specific exception. 
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such ID") //404
public class ExceptionForCont1 extends RuntimeException {

	public ExceptionForCont1(String someId){
		super (someId + "not found");
	}
}
