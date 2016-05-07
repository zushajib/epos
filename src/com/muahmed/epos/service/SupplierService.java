package com.muahmed.epos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.muahmed.epos.dao.ISupplierDAO;
import com.muahmed.epos.model.Supplier;

@Service("supplierService")   
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SupplierService implements ISupplierService {
	
	 @Autowired  
	 ISupplierDAO supplierDAO; 
	
	 @Override  
	 public String insertRow(Supplier supplier) {
		 return supplierDAO.insertRow(supplier);  
	 }  
	 
	 @Override
	 public List<Supplier> getList() {
		 return supplierDAO.getList(); 
	 }  
	 
	 @Override
	 public Supplier getRowById(String id) {
		 return supplierDAO.getRowById(id);
	 }  
	
	 @Override
	 public String updateRow(Supplier supplier) {
		 return supplierDAO.updateRow(supplier); 
	 }  
	 
	 @Override
	 public String deleteRow(String id) {
		 return supplierDAO.deleteRow(id);  
	 }
}
