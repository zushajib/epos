package com.muahmed.epos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.muahmed.epos.model.Supplier;
import com.muahmed.epos.service.ISupplierService;

@Controller 
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	private ISupplierService supplierService;
	
	 @RequestMapping(value="/create", method=RequestMethod.GET)  
	 public ModelAndView create(@ModelAttribute("supplier") Supplier supplier) {  
		 return new ModelAndView("/supplier/suppliercreate");  
	 }  
	 
	 @RequestMapping(value="/save", method=RequestMethod.POST)  
	 public ModelAndView save(@ModelAttribute("supplier") Supplier supplier) {  
		 supplierService.insertRow(supplier);  
		 return new ModelAndView("redirect:/supplier/list");  
	 }  
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)  
	 public ModelAndView getList() {  
		 List<Supplier> supplierList = supplierService.getList();  
		 return new ModelAndView("/supplier/supplierlist", "supplierList", supplierList);  
	 }  
	 
	 @Transactional
	 @RequestMapping(value="edit", method=RequestMethod.GET)  
	 public ModelAndView edit(@RequestParam String id, @ModelAttribute Supplier supplier) {  
		 Supplier supplierObject = supplierService.getRowById(id);  
		 System.out.println(supplierObject.getSupplierCode());
	  return new ModelAndView("/supplier/supplieredit", "supplierObject", supplierObject);  
	 }  
	 
	 @RequestMapping(value="update", method=RequestMethod.POST)  
	 public ModelAndView update(@ModelAttribute("supplier") Supplier supplier) {  
		 supplierService.updateRow(supplier);  
		 return new ModelAndView("redirect:/supplier/list");  
	 } 
	 
	 @RequestMapping(value="delete", method=RequestMethod.GET)  
	 public ModelAndView delete(@RequestParam String id) { 
		 supplierService.deleteRow(id);  
		 return new ModelAndView("redirect:/supplier/list");  
	 }  
	 
}
