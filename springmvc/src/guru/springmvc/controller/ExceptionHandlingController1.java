package guru.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import guru.springmvc.exceptions.ExceptionForCont1;
import guru.springmvc.model.ID;

/**
 * 
 * @author Srisarguru
 * Using HTTP Codes
 */
@Controller
public class ExceptionHandlingController1 {

	@RequestMapping("statuscodeexception.spring") 
	public String throwExceptionForCont1(@RequestParam("id") String id){
		ID ids= new ID();
		
		if(!ids.Idexists(id)){
		throw new ExceptionForCont1("someId"); //uses @ResponseStatus to send back http error code
		}
		
		return "view";
	}
}
