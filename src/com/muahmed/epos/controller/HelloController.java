package com.muahmed.epos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController {
	
	@RequestMapping("/welcome")
	protected ModelAndView helloWorld() {
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMsg", "Welcome, Zia");
		
		return model;
	}
	
	@RequestMapping("/hi")
	protected ModelAndView hiWorld() {
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMsg", "Hi, Zia");
		
		return model;
	}


}

/*public class HelloController extends AbstractController {
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		
		ModelAndView model1 = new ModelAndView("HelloPage");
		model1.addObject("welcomeMsg", "Hi, Zia");
		
		return model1;
	}

}*/
