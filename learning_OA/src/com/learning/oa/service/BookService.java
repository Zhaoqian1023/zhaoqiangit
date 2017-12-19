/**  
 * @Title: BookService.java
 * @Package com.learning.oa.service
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
package com.learning.oa.service;

import java.util.List;

import com.learning.oa.po.Book;

/**
 * ClassName: BookService 
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
public interface BookService {
	/**
	 * 
	 * @Description: 新增对象
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public void addObject(Book entity);
	/**
	 * 
	 * @Description: 删除对象
	 * @return void  
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public void delObject(Long id);
	/**
	 * 
	 * @Description: 更新指定对象
	 * @param @param entity   
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public void updateObject(Book entity);
	/**
	 * 
	 * @Description: 通过ID查询对象
	 * @param @param id
	 * @return T  
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public Book findObjectById(Long id);
	/**
	 * 
	 * @Description: 查询全部对象
	 * @param @return   
	 * @return List<T>  
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public List<Book> findAll();
	/**
	 * 
	 * @Description: 通过多个id查询多个对象
	 * @param @param ids
	 * @return List<T>  
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public List<Book> findByIds(Long[] ids);

}
