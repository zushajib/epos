package com.muahmed.epos.service;

import java.util.List;

import com.muahmed.epos.model.Supplier;

public interface ISupplierService {
	 public String insertRow(Supplier supplier);  
	 public List<Supplier> getList();  
	 public Supplier getRowById(String id);  
	 public String updateRow(Supplier supplier);  
	 public String deleteRow(String id);  
}
