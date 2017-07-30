package guru.springmvc.exceptions;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author Srisarguru
 *
 */
@EnableWebMvc //is needed for global exception handling to handle the exception
@ControllerAdvice
public class GlobalExceptionHandler {
	
	//@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED, reason="Global exception occured") //will override exception handler
	@ExceptionHandler(ExceptionForGlobal.class)
	public String handleExceptionForGlobal(){
		return "exceptionglobal";
	}
	
	
	
}
