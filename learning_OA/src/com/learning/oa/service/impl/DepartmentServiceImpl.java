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
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	@Qualifier("departmentDaoImpl")
	DepartmentDao departmentDao;
	
	public List<Department> findAll(){
		return departmentDao.findAll();
	}
	@Transactional
	public void delete(Department model) {
		departmentDao.delObject(model.getId());
		
	}

	public void add(Department model) {
		departmentDao.addObject(model);
	}

	public Department getById(Long parentId) {
		return departmentDao.findObjectById(parentId);
	}
	@Transactional
	public void edit(Department model) {
		departmentDao.updateObject(model);
		
	}

	public List<Department> findAllParent() {
		return departmentDao.findAllParent();
		
	}

	public List<Department> findChildrensByParent(Long parentId) {
		return departmentDao.findByParentid(parentId);
	}
	

}
