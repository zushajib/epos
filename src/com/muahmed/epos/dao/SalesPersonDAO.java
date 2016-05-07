package com.muahmed.epos.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.muahmed.epos.model.SalesPerson;

@Repository("salesPersonDAO")
public class SalesPersonDAO implements ISalesPersonDAO {
	
	@Autowired  
    private SessionFactory sessionfactory;
	
	@Override  
    @Transactional 
	public int insertRow(SalesPerson salesperson) {
		sessionfactory.getCurrentSession().saveOrUpdate(salesperson); 
		return 1;
	}  
	
	@Override  
    @Transactional
	public List<SalesPerson> getList() {
		@SuppressWarnings("unchecked")  
        List<SalesPerson> salespersonlist = sessionfactory.getCurrentSession()  
                .createCriteria(SalesPerson.class).list();  
        
		return salespersonlist;  
	}  
	
	@Override  
    @Transactional
	public SalesPerson getRowById(int id) {
		SalesPerson salesperson = (SalesPerson) sessionfactory.getCurrentSession().load(SalesPerson.class, id);  
		
		return salesperson;  
	}  
	  
	 public int updateRow(SalesPerson salesperson) {
		 sessionfactory.getCurrentSession().saveOrUpdate(salesperson);
		 return 1;
	}  
	 
	 @Override  
	 @Transactional
	 public int deleteRow(int id) {
		
		SalesPerson salesperson = (SalesPerson) sessionfactory.getCurrentSession().load(SalesPerson.class, id);
		//sessionfactory.delete(salesperson);
		return 0;
	}  
}
