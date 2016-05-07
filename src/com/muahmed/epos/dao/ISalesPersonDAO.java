package com.muahmed.epos.dao;

import java.util.List;

import com.muahmed.epos.model.SalesPerson;

public interface ISalesPersonDAO {
	public int insertRow(SalesPerson salesperson);  
	public List<SalesPerson> getList();  
	public SalesPerson getRowById(int id);
	public int updateRow(SalesPerson salesperson);
	public int deleteRow(int id); 
}
