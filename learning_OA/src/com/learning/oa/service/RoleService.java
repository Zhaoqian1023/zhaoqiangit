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

	/**
	 * @Description: 删除指定的对象
	 * @author zhaoqian
	 * @date 2017年12月29日
	 */
	public void delRole(Role role);
	/**
	 * 
	 * @Description: 通过id获取实体对象
	 * @param @param id
	 * @param @return   
	 * @return Role  
	 * @author zhaoqian
	 * @date 2018年1月2日
	 */
	public Role getById(Long id);
	/**
	 * 
	 * @Description: 修改岗位信息
	 * @param @param role   
	 * @return void  
	 * @throws
	 * @author zhaoqian
	 * @date 2018年1月2日
	 */
	public void update(Role role);

	/**
	 * @Description: 添加岗位
	 * @param @param role   
	 * @return void  
	 * @throws
	 * @author zhaoqian
	 * @date 2018年1月3日
	 */
	public void add(Role role);

}
