/**  
 * @Title: DepartmentAction.java
 * @Package com.learning.oa.action
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
package com.learning.oa.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.learning.oa.base.BaseAction;
import com.learning.oa.po.Department;

/**
 * ClassName: DepartmentAction 
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
@SuppressWarnings("serial")
@Controller("departmentAction")
public class DepartmentAction extends BaseAction<Department> {
	Logger logger = LoggerFactory.getLogger(DepartmentAction.class);
	private Long parentId;
	
	/**
	 * 显示部门列表
	 */
	public String list(){
		//List<Department> list = this.departmentService.findAll();
		List<Department> list = null;
		if(parentId == null){
			list = this.departmentService.findAllParent();
		}else{
			list = this.departmentService.findChildrensByParent(parentId);
			Department dept = this.departmentService.getById(parentId);
			this.getValueStack().set("dept", dept);
		}
		this.getValueStack().set("list", list);
		return "departmentList";
	}
	/**
	 * 删除部门（级联效果）
	 */
	public String delete(){
		this.departmentService.delete(this.model);
		return "toList";
	}
	/**
	 * 跳转到添加部门页面
	 */
	public String addUI(){
		this.model.setId(null);
		List<Department> list = this.departmentService.findAll();
		this.getValueStack().set("departmentList", list);
		return "addUI";
	}
	/**
	 * 新增部门
	 */
	public String add(){
		if(parentId != null){
			Department parent = this.departmentService.getById(parentId);
			this.model.setParent(parent);
		}else{
			this.model.setParent(null);
		}
		this.departmentService.add(this.model);
		return "toList";
	}
	/**
	 * 
	 * @Description: 跳转到修改页面
	 * @return String  
	 * @author zhaoqian
	 * @date 2018年1月8日
	 */
	public String editUI(){
		List<Department> list = this.departmentService.findAll();
		this.getValueStack().set("departmentList", list);
		Department dept = this.departmentService.getById(this.model.getId());
		this.getValueStack().push(dept);
		if(dept.getParent() != null){
			parentId = dept.getParent().getId();
		}else{
			parentId = null;
		}
		return "editUI";
	}
	/**
	 * 
	 * @Description: 修改部门信息
	 * @return String  
	 * @author zhaoqian
	 * @date 2018年1月8日
	 */
	public String edit(){
		if(parentId == null){
			this.model.setParent(null);
		}else{
			Department parent = this.departmentService.getById(parentId);
			this.model.setParent(parent);
		}
		this.departmentService.edit(this.model);
		return "toList";
	}
	
	
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
	

}
