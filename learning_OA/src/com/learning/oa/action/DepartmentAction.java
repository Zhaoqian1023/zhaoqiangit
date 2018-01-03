/**  
 * @Title: DepartmentAction.java
 * @Package com.learning.oa.action
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
package com.learning.oa.action;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.learning.oa.base.BaseAction;
import com.learning.oa.po.Department;

/**
 * ClassName: DepartmentAction 
 * @Description: TODO
 * @author zhaoqian
 * @date 2018年1月3日
 */
@Controller("departmentAction")
public class DepartmentAction extends BaseAction<Department> {
	
	public String list(){
		List<Department> list = this.departmentService.findAll();
		this.getValueStack().set("list", list);
		
		return "toList";
	}

}
