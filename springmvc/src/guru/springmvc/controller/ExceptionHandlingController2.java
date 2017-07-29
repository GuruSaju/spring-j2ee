package guru.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import guru.springmvc.exceptions.ExceptionForCont1;
import guru.springmvc.exceptions.ExceptionForCont2;
import guru.springmvc.model.ID;

/**
 * 
 * @author Srisarguru
 *
 */

@Controller
public class ExceptionHandlingController2 {
	@RequestMapping("exceptionhandlerexception.spring") 
	public String throwExceptionForCont2(@RequestParam("id") String id){
		ID ids= new ID();
		
		if(!ids.Idexists(id)){
		throw new ExceptionForCont2("someId"); //uses @ResponseStatus to send back http error code
		}
		
		return "view";
	}
	
	@ExceptionHandler(ExceptionForCont2.class)
	public ModelAndView handleEmployeeNotFoundException(HttpServletRequest request, Exception ex){
		
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("exception", ex);
	    modelAndView.addObject("url", request.getRequestURL());
	    
	    modelAndView.setViewName("error");
	    return modelAndView;
	}
}
