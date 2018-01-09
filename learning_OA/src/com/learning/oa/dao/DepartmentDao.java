/**  
 * @Title: DepartmentDao.java
 * @Package com.learning.oa.dao
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
package com.learning.oa.dao;

import java.util.List;

import com.learning.oa.base.BaseDao;
import com.learning.oa.po.Department;

/**
 * ClassName: DepartmentDao 
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
public interface DepartmentDao extends BaseDao<Department> {

	/**
	 * @Description: 查询顶级部门
	 * @param @return   
	 * @return List<Department>  
	 * @throws
	 * @author zhaoqian
	 * @date 2018年1月8日
	 */
	public List<Department> findAllParent();

	/**
	 * @Description: 通过上级部门id查询子部门
	 * @param @param parentId
	 * @param @return   
	 * @return List<Department>  
	 * @throws
	 * @author zhaoqian
	 * @date 2018年1月8日
	 */
	public List<Department> findByParentid(Long parentId);

}
