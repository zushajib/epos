package com.muahmed.epos.service;

import java.util.List;

import com.muahmed.epos.model.SalesPerson;

public interface ISalesPersonService {

	 public int insertRow(SalesPerson salesperson);  
	  
	 public List<SalesPerson> getList();  
	  
	 public SalesPerson getRowById(int id);  
	  
	 public int updateRow(SalesPerson salesperson);  
	  
	 public int deleteRow(int id);  
}
