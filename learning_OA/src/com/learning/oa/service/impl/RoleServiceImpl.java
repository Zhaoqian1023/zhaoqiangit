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

	/* (non-Javadoc)
	 * @see com.learning.oa.service.RoleService#delRole(com.learning.oa.po.Role)
	 */
	@Override
	public void delRole(Role role) {
		roleDao.delObject(role.getId());
		
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.service.RoleService#getById(java.lang.Long)
	 */
	@Override
	public Role getById(Long id) {
		return roleDao.findObjectById(id);
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.service.RoleService#update(com.learning.oa.po.Role)
	 */
	@Override
	public void update(Role role) {
		roleDao.updateObject(role);
		
	}

	/* (non-Javadoc)
	 * @see com.learning.oa.service.RoleService#add(com.learning.oa.po.Role)
	 */
	@Override
	public void add(Role role) {
		roleDao.addObject(role);
		
	}

}
