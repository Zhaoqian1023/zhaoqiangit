/**  
 * @Title: DepartmentServiceImpl.java
 * @Package com.learning.oa.service.impl
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
package com.learning.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.oa.dao.DepartmentDao;
import com.learning.oa.po.Department;
import com.learning.oa.service.DepartmentService;

/**
 * ClassName: DepartmentServiceImpl 
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
@Service("departmentServiceImpl")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	@Qualifier("departmentDaoImpl")
	DepartmentDao departmentDao;
	
	public List<Department> findAll(){
		return departmentDao.findAll();
	}
	

}
