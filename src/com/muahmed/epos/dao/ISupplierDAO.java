package com.muahmed.epos.dao;

import java.util.List;

import com.muahmed.epos.model.Supplier;

public interface ISupplierDAO {
	public String insertRow(Supplier supplier);  
	public List<Supplier> getList();  
	public Supplier getRowById(String id);  
	public String updateRow(Supplier supplier);  
	public String deleteRow(String id); 
}
