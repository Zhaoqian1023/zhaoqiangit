/**  
 * @Title: DepartmentDaoImpl.java
 * @Package com.learning.oa.dao.impl
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
package com.learning.oa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.learning.oa.base.BaseDaoImpl;
import com.learning.oa.dao.DepartmentDao;
import com.learning.oa.po.Department;

/**
 * ClassName: DepartmentDaoImpl 
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
@Repository("departmentDaoImpl")
@SuppressWarnings("unchecked")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements
		DepartmentDao {

	public List<Department> findAllParent() {
		String hql = "FROM Department d WHERE d.parent IS NULL";
		return this.getSession().createQuery(hql).list();
	}

	public List<Department> findByParentid(Long parentId) {
		String hql = "FROM Department d WHERE d.parent.id = :parentId";
		return this.getSession().createQuery(hql).setLong("parentId", parentId).list();
	}

	

}
