package com.muahmed.epos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.muahmed.epos.dao.ISalesPersonDAO;
import com.muahmed.epos.model.SalesPerson;

@Service("salesPersonService")   
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SalesPersonService implements ISalesPersonService {
	
	 @Autowired  
	 ISalesPersonDAO salesPersonDAO; 
	
	 @Override  
	 public int insertRow(SalesPerson salesperson) {
		 return salesPersonDAO.insertRow(salesperson);  
	 }  
	 
	 @Override
	 public List<SalesPerson> getList() {
		 return salesPersonDAO.getList(); 
	 }  
	 
	 @Override
	 public SalesPerson getRowById(int id) {
		 return salesPersonDAO.getRowById(id);
	 }  
	
	 @Override
	 public int updateRow(SalesPerson salesperson) {
		 return salesPersonDAO.updateRow(salesperson); 
	 }  
	 
	 @Override
	 public int deleteRow(int id) {
		 return salesPersonDAO.deleteRow(id);  
	 }
}
