/**  
 * @Title: RoleService.java
 * @Package com.learning.oa.service
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月29日
 */
package com.learning.oa.service;

import java.util.List;

import com.learning.oa.po.Role;

/**
 * ClassName: RoleService 
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月29日
 */
public interface RoleService {
	/**
	 * 
	 * @Description: 查询全部权限列表
	 * @param @return   
	 * @return List<Role>  
	 * @author zhaoqian
	 * @date 2017年12月29日
	 */
	public List<Role> findAll();

}
