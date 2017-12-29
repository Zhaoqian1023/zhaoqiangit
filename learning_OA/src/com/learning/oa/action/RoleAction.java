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
@Controller("roleAction")
public class RoleAction extends BaseAction<Role> {
	
	
	public String list(){
		List<Role> list = roleService.findAll();
		ValueStack vStack = getValueStack();
		vStack.set("list", list);
		return "RoleList";
	}
	

}
