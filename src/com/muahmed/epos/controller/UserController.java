package com.muahmed.epos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.muahmed.epos.dao.UserDAO;
import com.muahmed.epos.dao.UserDAOImpl;
import com.muahmed.epos.model.User;

public class UserController {
	
	public static void main(String[] args) {
		
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		UserDAOImpl dao = ctx.getBean("myUserDAO", UserDAOImpl.class); */
		//System.out.println(dao.getUserCount());
	}
	/*private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response, User user) throws Exception {
		userDAO.saveUser(user);
		return new ModelAndView("redirect:list.htm");
	}

	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("userList", userDAO.listUser());
		modelMap.addAttribute("user", new User());
		return new ModelAndView("userForm", modelMap);
	}*/
}
