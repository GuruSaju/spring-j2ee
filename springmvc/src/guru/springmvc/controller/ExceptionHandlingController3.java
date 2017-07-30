package guru.springmvc.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import guru.springmvc.exceptions.ExceptionForCont2;
import guru.springmvc.exceptions.ExceptionForGlobal;
import guru.springmvc.model.ID;

/**
 * 
 * @author Srisarguru
 *
 */
@Controller
public class ExceptionHandlingController3 {
	
	@RequestMapping("exceptionhandlerglobalexception.spring") 
	public String throwExceptionForCont3(@RequestParam("id") String id) {
		ID ids= new ID();
		
		if(!ids.Idexists(id)){
		throw new ExceptionForGlobal("someId");
		//throw new SQLException("SQLException, id="+id);//uses @ResponseStatus to send back http error code
		}
		
		return "view";
	}
}
