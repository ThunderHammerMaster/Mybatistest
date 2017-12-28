package com.mzk.dao;

import java.util.List;

import com.mzk.entity.Employees;

public interface EmployeesDao {
	public void addEmp(Employees emp);
	public List<Employees> queryAllEmployees();
	public void delEmp(int id);
	public Employees queryEmpById(int id);
	public void updateEmp(Employees emp);
}
