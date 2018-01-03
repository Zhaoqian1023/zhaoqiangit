/**  
 * @Title: BaseAction.java
 * @Package com.learning.oa.base
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月20日
 */
package com.learning.oa.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.learning.oa.service.BookService;
import com.learning.oa.service.DepartmentService;
import com.learning.oa.service.RoleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * ClassName: BaseAction
 * 
 * @Description: 基础action
 * @author zhaoqian
 * @date 2017年12月20日
 */
@SuppressWarnings("serial")
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
	
	protected T model;
	@Autowired
	@Qualifier("bookServiceImpl")
	public BookService bookService;
	@Autowired
	@Qualifier("roleServiceImpl")
	public RoleService roleService;
	@Autowired
	@Qualifier("departmentServiceImpl")
	public DepartmentService departmentService;
	
	

	@SuppressWarnings("unchecked")
	public BaseAction() {
		// 获取父类类型
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		// 获取父类的泛型
		Type[] v = type.getActualTypeArguments();
		Class<T> clazz = (Class<T>) v[0];
		try {
			// 获取实体类型
			model = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	public T getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}
	
	/**
	 * 获得值栈
	 */
	protected ValueStack getValueStack(){
		return ActionContext.getContext().getValueStack();
	}

}
