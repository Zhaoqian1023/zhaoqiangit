/**  
 * @Title: BookServiceImpl.java
 * @Package com.learning.oa.service.impl
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
package com.learning.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.oa.dao.BookDao;
import com.learning.oa.po.Book;
import com.learning.oa.service.BookService;

/**
 * ClassName: BookServiceImpl 
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
@Service("bookServiceImpl")
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	@Qualifier("bookDaoImpl")
	private BookDao bookDao;

	/* (non-Javadoc)
	 * @see com.learning.oa.service.BookService#addObject(com.learning.oa.po.Book)
	 */
	@Override
	public void addObject(Book entity) {
		bookDao.addObject(entity);

	}

	/* (non-Javadoc)
	 * @see com.learning.oa.service.BookService#delObject(java.lang.Long)
	 */
	@Override
	public void delObject(Long id) {
		bookDao.delObject(id);

	}

	/* (non-Javadoc)
	 * @see com.learning.oa.service.BookService#updateObject(com.learning.oa.po.Book)
	 */
	@Override
	public void updateObject(Book entity) {
		bookDao.updateObject(entity);

	}

	/* (non-Javadoc)
	 * @see com.learning.oa.service.BookService#findObjectById(java.lang.Long)
	 */
	@Override
	public Book findObjectById(Long id) {
		return bookDao.findObjectById(id);
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.service.BookService#findAll()
	 */
	@Override
	public List<Book> findAll() {
		return bookDao.findAll();
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.service.BookService#findByIds(java.lang.Long[])
	 */
	@Override
	public List<Book> findByIds(Long[] ids) {
		return bookDao.findByIds(ids);
	}

}
