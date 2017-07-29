package guru.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springmvc.exceptions.ExceptionForCont1;

/**
 * 
 * @author Srisarguru
 *
 */
@Controller
public class ExceptionHandlingController1 {

	@RequestMapping("statuscodeexception.spring") 
	public String throwExceptionForCont1(){
		throw new ExceptionForCont1("someId");
	}
}
