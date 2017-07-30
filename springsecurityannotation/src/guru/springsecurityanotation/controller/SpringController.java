package guru.springsecurityanotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Srisarguru
 *
 */

@Controller
public class SpringController {
	
	@RequestMapping(value = "/user.spring", method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Hello User User");
		model.addObject("message", "What uuup");
		model.setViewName("welcome");
		return model;

	}

	@RequestMapping(value = "/admin.spring", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Hello Admin User");
		model.addObject("message", "Mushi Mushiiii");
		model.setViewName("admin");

		return model;

	}
	@RequestMapping(value = "/other.spring", method = RequestMethod.GET)
	public ModelAndView otherPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Hello  Other User");
		model.addObject("message", "Holaaaaaaaaa!");
		model.setViewName("admin");

		return model;

	}
}
