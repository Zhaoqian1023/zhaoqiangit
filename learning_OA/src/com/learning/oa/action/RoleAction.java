/**  
 * @Title: RoleAction.java
 * @Package com.learning.oa.action
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月29日
 */
package com.learning.oa.action;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.learning.oa.base.BaseAction;
import com.learning.oa.po.Role;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * ClassName: RoleAction 
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月29日
 */
@SuppressWarnings("serial")
@Controller("roleAction")
public class RoleAction extends BaseAction<Role> {
	
	/**
	 * 
	 * @Description: 查询岗位列表
	 * @author zhaoqian
	 * @date 2017年12月29日
	 */
	public String list(){
		List<Role> list = this.roleService.findAll();
		ValueStack vStack = this.getValueStack();
		vStack.set("list", list);
		return "roleList";
	}
	/**
	 * 删除岗位
	 */
	public String delete(){
		Role role = this.getModel();
		this.roleService.delRole(role);
		return "toList";
	}
	/**
	 * 跳转到岗位修改页面
	 */
	public String editUI(){
		Role role = roleService.getById(model.getId());
		this.getValueStack().push(role);
		return "editUI";
	}
	/**
	 * 修改岗位信息
	 */
	public String edit(){
		//确保先查询再更新，因为有相关关联信息
		Role role = roleService.getById(this.model.getId());
		role.setName(this.model.getName());
		role.setDescription(this.model.getDescription());
		roleService.update(role);
		return "toList";
	}
	/**
	 * 跳转到新增岗位页面
	 */
	public String addUI(){
		this.model.setId(null);
		this.model.setName(null);
		this.model.setDescription(null);
		this.getValueStack().push(model);
		return "addUI";
	}
	/**
	 * 添加岗位
	 */
	public String add(){
		Role role = new Role();
		role.setName(this.model.getName());
		role.setDescription(this.model.getDescription());
		roleService.add(role);
		return "toList";
	}

}
