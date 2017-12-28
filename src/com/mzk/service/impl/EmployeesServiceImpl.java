package com.mzk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzk.dao.EmployeesDao;
import com.mzk.entity.Employees;
import com.mzk.service.EmployeesService;
@Service("employeesService")
public class EmployeesServiceImpl implements EmployeesService{
	@Autowired
	private EmployeesDao employeesDao;

	@Override
	public void addEmp(Employees emp) {
		employeesDao.addEmp(emp);
	}

	@Override
	public List<Employees> queryAllEmployees() {
		
		return employeesDao.queryAllEmployees();
	}

	@Override
	public void delEmp(int id) {
		employeesDao.delEmp(id);
		
	}

	@Override
	public Employees queryEmpById(int id) {
		
		return employeesDao.queryEmpById(id);
	}

	@Override
	public void updateEmp(Employees emp) {
		employeesDao.updateEmp(emp);
		
	}
}
