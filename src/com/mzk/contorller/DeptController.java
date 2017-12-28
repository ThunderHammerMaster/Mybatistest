package com.mzk.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mzk.entity.Dept;
import com.mzk.service.DeptService;

@RequestMapping("deptt")
@Controller
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("addE")
	public String toAdd(Model model) {
		System.out.println("111");
		List<Dept> l=deptService.queryAllDept();
		model.addAttribute("deptList", l);
		model.addAttribute("a", "a");
		return "inputPage";
	}
}
