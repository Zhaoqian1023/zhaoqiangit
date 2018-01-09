/**  
 * @Title: DepartmentService.java
 * @Package com.learning.oa.service
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
package com.learning.oa.service;

import java.util.List;

import com.learning.oa.po.Department;

/**
 * ClassName: DepartmentService 
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
public interface DepartmentService {
	/**
	 * 
	 * @Description: 查询全部部门
	 * @param @return   
	 * @return List<Department>  
	 * @throws
	 * @author zhaoqian
	 * @date 2018年1月3日
	 */
	public List<Department> findAll();

	/**
	 * @Description: 删除部门对象
	 * @param @param model   
	 * @return void  
	 * @throws
	 * @author zhaoqian
	 * @date 2018年1月4日
	 */
	public void delete(Department model);

	/**
	 * @Description: 添加部门
	 * @param @param model   
	 * @return void  
	 * @throws
	 * @author zhaoqian
	 * @date 2018年1月4日
	 */
	public void add(Department model);

	/**
	 * @Description: 通过id获得部门对象
	 * @param @param parentId
	 * @return Department  
	 * @author zhaoqian
	 * @date 2018年1月8日
	 */
	public Department getById(Long parentId);

	/**
	 * @Description: 修改部门信息
	 * @param @param model   
	 * @return void  
	 * @throws
	 * @author zhaoqian
	 * @date 2018年1月8日
	 */
	public void edit(Department model);

	/**
	 * @Description: 查询最高级部门
	 * @return void  
	 * @author zhaoqian
	 * @date 2018年1月8日
	 */
	public List<Department> findAllParent();

	/**
	 * @Description: 查询子部门
	 * @param @param parentId 上级部门id
	 * @return List<Department>  
	 * @author zhaoqian
	 * @date 2018年1月8日
	 */
	public List<Department> findChildrensByParent(Long parentId);

}
