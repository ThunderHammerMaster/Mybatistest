package com.mzk.service;

import java.util.List;

import com.mzk.entity.Employees;

public interface EmployeesService {
	public void addEmp(Employees emp);
	public List<Employees> queryAllEmployees();
	public void delEmp(int id);
	public Employees queryEmpById(int id);
	public void updateEmp(Employees emp);
}
