package com.dev.model.dao;
import java.util.List;

import com.dev.model.beans.EmployeeDto;

public interface EmpInfoDAO {

	public EmployeeDto login(String UserId, String UserPassword);
	
	public EmployeeDto  searchEmp(String Emp_ID);
	
	public boolean createEmpProfile(EmployeeDto emp);
	
	public boolean updateEmp(String Emp_ID);
	
	public List<EmployeeDto> empDetails();
	
}