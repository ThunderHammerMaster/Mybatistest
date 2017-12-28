package com.mzk.contorller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mzk.entity.Employees;
import com.mzk.service.EmployeesService;

@RequestMapping("/emp")
@Controller
public class EmployeesController {
	@Autowired
	private EmployeesService employeesService;
	
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"), true));
	}
	
	@RequestMapping("/add")
	public String addE(Employees employee) {
		employee.setCreateTime(new Date());
		employeesService.addEmp(employee);
		return "redirect:/HomePage.jsp";
	}
	
	@RequestMapping("/query")
	public String queryAllEmp(Model model) {
		List<Employees> l=employeesService.queryAllEmployees();
		model.addAttribute("empL", l);
		return "EmployeeListPage";
	}
	@RequestMapping("/del")
	public String deleteEmp(int id) {
		employeesService.delEmp(id);
		return "forward:/emp/query";
	}
	
	@RequestMapping("/edit")
	public String editEmp(int id,Model model) {
		Employees emp=employeesService.queryEmpById(id);
		model.addAttribute("emp", emp);
		model.addAttribute("a", "b");
		return "inputPage";
	}
	
	@RequestMapping("/update")
	public String updateEmp(Employees emp) {
		employeesService.updateEmp(emp);
		return "forward:/emp/query";
	}
}
