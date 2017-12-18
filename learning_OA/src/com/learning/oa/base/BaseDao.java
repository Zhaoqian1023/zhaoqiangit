/**  
 * @Title: BaseDao.java
 * @Package com.learning.oa.base
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
package com.learning.oa.base;

import java.util.List;

/**
 * ClassName: BaseDao 
 * @Description: 通用dao接口
 * @author zhaoqian
 * @date 2017年12月18日
 */
public interface BaseDao<T> {
	/**
	 * 
	 * @Description: 新增对象
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public void addObject(T entity);
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
	public void updateObject(T entity);
	/**
	 * 
	 * @Description: 通过ID查询对象
	 * @param @param id
	 * @return T  
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public T findObjectById(Long id);
	/**
	 * 
	 * @Description: 查询全部对象
	 * @param @return   
	 * @return List<T>  
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public List<T> findAll();
	/**
	 * 
	 * @Description: 通过多个id查询多个对象
	 * @param @param ids
	 * @return List<T>  
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public List<T> findByIds(Long[] ids);
	

}
