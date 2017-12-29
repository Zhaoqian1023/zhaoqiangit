/**  
 * @Title: BookDaoImpl.java
 * @Package com.learning.oa.dao.impl
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
package com.learning.oa.dao.impl;

import org.springframework.stereotype.Repository;

import com.learning.oa.base.BaseDaoImpl;
import com.learning.oa.dao.BookDao;
import com.learning.oa.po.Book;

/** 
 * ClassName: BookDaoImpl 
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
@Repository("bookDaoImpl")
public class BookDaoImpl extends BaseDaoImpl<Book> implements BookDao {

	
}
