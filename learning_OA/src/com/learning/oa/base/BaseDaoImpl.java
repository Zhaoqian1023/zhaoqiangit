/**  
 * @Title: BaseDaoImpl.java
 * @Package com.learning.oa.base
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
package com.learning.oa.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * ClassName: BaseDaoImpl 
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	private Class<T> obj;
	
	public BaseDaoImpl(){
		//获得父类
		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
		//获得真正的实体类型
		Type[] types = genericSuperclass.getActualTypeArguments();
		obj = (Class<T>) types[0];
 	}

	/* (non-Javadoc)
	 * @see com.learning.oa.base.BaseDao#addObject()
	 */
	@Override
	public void addObject(T entity) {
		this.getSession().save(entity);
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.base.BaseDao#delObject()
	 */
	@Override
	public void delObject(Long id) {
		this.getSession().delete(this.getSession().get(obj, id));
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.base.BaseDao#updateObject(java.lang.Object)
	 */
	@Override
	public void updateObject(T entity) {
		this.getSession().update(entity);
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.base.BaseDao#findObjectById(java.lang.Long)
	 */
	@Override
	public T findObjectById(Long id) {
		return (T) this.getSession().get(obj, id);
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.base.BaseDao#findAll()
	 */
	@Override
	public List<T> findAll() {
		String hqlString = "FROM " + obj.getSimpleName(); 
		return this.getSession().createQuery(hqlString).list();
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.base.BaseDao#findByIds(java.lang.Long[])
	 */
	@Override
	public List<T> findByIds(Long[] ids) {
		String hqlString = "FROM " + obj.getSimpleName() +" WHERE id in (:ids)";
		Query query = this.getSession().createQuery(hqlString);
		query.setParameterList("ids", ids);//传递数组形式（多个参数）
		return query.list();
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}



}
