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

}
