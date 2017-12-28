package com.mzk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzk.dao.DeptDao;
import com.mzk.entity.Dept;
import com.mzk.service.DeptService;
@Service("deptService")
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDao deptDao;

	@Override
	public List<Dept> queryAllDept() {
		
		return deptDao.queryAllDept();
	}
	
}
