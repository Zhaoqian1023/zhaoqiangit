/**  
 * @Title: RoleServiceImpl.java
 * @Package com.learning.oa.service.impl
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月29日
 */
package com.learning.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.oa.dao.RoleDao;
import com.learning.oa.po.Role;
import com.learning.oa.service.RoleService;


/**
 * ClassName: RoleServiceImpl 
 * @Description: TODO
 * @author zhaoqian
 * @date 2017年12月29日
 */
@Service("roleServiceImpl")
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	@Qualifier("roleDaoImpl")
	private RoleDao roleDao;

	/* (non-Javadoc)
	 * @see com.learning.oa.service.RoleService#findAll()
	 */
	@Override
	public List<Role> findAll() {
		
		return roleDao.findAll();
	}

}
