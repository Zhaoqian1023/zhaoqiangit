/**  
 * @Title: Book.java
 * @Package com.learning.oa.po
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
package com.learning.oa.po;

/**
 * ClassName: Book 
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月18日
 */
public class Book {
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
	

}
