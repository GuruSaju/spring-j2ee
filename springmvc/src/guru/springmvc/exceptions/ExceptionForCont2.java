package guru.springmvc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author Srisarguru
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such ID") //404
public class ExceptionForCont2 extends RuntimeException {
	public ExceptionForCont2(String someId){
		super (someId + "not found");
	}
}
