/**  
 * @Title: TestBaseDao.java
 * @Package com.learning.test
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
package com.learning.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.oa.po.Book;
import com.learning.oa.service.BookService;

/**
 * ClassName: TestBaseDao 
 * @Description: 测试BaseDao接口中的各个方法
 * @author zhaoqian
 * @date 2017年12月18日
 */
public class TestBaseDao {
	
	
	@Test
	public void run(){
		this.testDel();
		
	}
	/**
	 * @Description: 测试添加
	 * @return void  
	 * @author zhaoqian
	 * @date 2017年12月18日
	 */
	public void testAdd(){
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring.xml");
		BookService bs = (BookService) ctx.getBean("bookServiceImpl");
		Book book = new Book();
		book.setName("测试删除");
		bs.addObject(book);
	}
	/**
	 * 
	 * @Description: 删除对象
	 * @return void  
	 * @author zhaoqian
	 * @date 2017年12月19日
	 */
	public void testDel(){
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring.xml");
		BookService bs = (BookService) ctx.getBean("bookServiceImpl");
		Long id = (long) 4;
		bs.delObject(id);
	}
	/**
	 * 
	 * @Description: 修改对象
	 * @return void  
	 * @author zhaoqian
	 * @date 2017年12月19日
	 */
	public void testChangeObj(){
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring.xml");
		BookService bs = (BookService) ctx.getBean("bookServiceImpl");
		Long id = (long) 1;
		Book entity = bs.findObjectById(id);
		entity.setName("Java编程思想");
		bs.updateObject(entity);
	}
	
	/**
	 * 
	 * @Description: 测试查询全部
	 * @return void  
	 * @author zhaoqian
	 * @date 2017年12月19日
	 */
	public void testQueryAll(){
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring.xml");
		BookService bs = (BookService) ctx.getBean("bookServiceImpl");
		System.out.println(bs.findAll());
	}
	/**
	 * 
	 * @Description: 通过id查询
	 * @return void  
	 * @author zhaoqian
	 * @date 2017年12月19日
	 */
	public void testQueryById(){
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring.xml");
		BookService bs = (BookService) ctx.getBean("bookServiceImpl");
		Long id = (long) 1;
		System.out.println(bs.findObjectById(id));
	}
	/**
	 * 
	 * @Description: 通过id数组查询
	 * @return void  
	 * @author zhaoqian
	 * @date 2017年12月19日
	 */
	public void testQueryByIds(){
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring.xml");
		BookService bs = (BookService) ctx.getBean("bookServiceImpl");
		Long[] ids = new Long[2];
		ids[0] = (long) 1;
		ids[1] = (long) 2;
		System.out.println(bs.findByIds(ids));
	}


}
