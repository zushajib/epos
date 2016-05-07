package com.muahmed.epos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.muahmed.epos.model.SalesPerson;
import com.muahmed.epos.service.ISalesPersonService;

@Controller 
@RequestMapping("/salesperson") 
public class SalesPersonController {
	
	@Autowired
    private ISalesPersonService salesPersonService;
	
	 @RequestMapping("/create")  
	 public ModelAndView getForm(@ModelAttribute("salesperson") SalesPerson salesperson) {  
		 return new ModelAndView("form");  
	 }  
	 
	 @RequestMapping("/register")  
	 public ModelAndView registerUser(@ModelAttribute("salesperson") SalesPerson salesperson) {  
		 salesPersonService.insertRow(salesperson);  
		 return new ModelAndView("redirect:list");  
	 }  
	  
	 @RequestMapping("list")  
	 public ModelAndView getList() {  
		 List<SalesPerson> salesPersonList = salesPersonService.getList();  
		 return new ModelAndView("list", "salesPersonList", salesPersonList);  
	 }  
	  
	 @RequestMapping("delete")  
	 public ModelAndView deleteUser(@RequestParam int id) {  
		 salesPersonService.deleteRow(id);  
	  return new ModelAndView("redirect:list");  
	 }  
	  
	 @RequestMapping("edit")  
	 public ModelAndView editUser(@RequestParam int id, @ModelAttribute SalesPerson salesperson) {  
		 SalesPerson salesPersonObject = salesPersonService.getRowById(id);  
	  return new ModelAndView("edit", "salesPersonObject", salesPersonObject);  
	 }  
	  
	 @RequestMapping("update")  
	 public ModelAndView updateUser(@ModelAttribute SalesPerson salesperson) {  
		 salesPersonService.updateRow(salesperson);  
		 return new ModelAndView("redirect:list");  
	 } 
}
