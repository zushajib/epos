package com.muahmed.epos.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.muahmed.epos.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAO implements ISupplierDAO {
	
	@Autowired  
    private SessionFactory sessionfactory;
	
	@Override
	@Transactional 
	public String insertRow(Supplier supplier) {
		String id = (String) sessionfactory.getCurrentSession().save(supplier); 
		return id;
	}  
	
	@Override
	@Transactional
	public List<Supplier> getList() {
		@SuppressWarnings("unchecked")  
        List<Supplier> supplierList = sessionfactory.getCurrentSession().createCriteria(Supplier.class).list();  
        
		return supplierList;  
	}  
	
	@Override
	@Transactional
	public Supplier getRowById(String id) {
		Supplier supplier = (Supplier) sessionfactory.getCurrentSession().load(Supplier.class, id);  
		return supplier;  
	}  
	 
	@Override
	@Transactional
	 public String updateRow(Supplier supplier) {
		 sessionfactory.getCurrentSession().saveOrUpdate(supplier);
		 return "id";
	}  
	 
	@Override
	@Transactional
	public String deleteRow(String id) {
		Supplier supplier = (Supplier) sessionfactory.getCurrentSession().load(Supplier.class, id);
		sessionfactory.getCurrentSession().delete(supplier);
		return "0";
	}  
}
