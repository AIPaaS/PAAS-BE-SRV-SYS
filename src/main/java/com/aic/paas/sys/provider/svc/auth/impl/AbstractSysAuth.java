package com.aic.paas.sys.provider.svc.auth.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.core.util.BinaryUtils;
import com.aic.paas.sys.provider.bean.CSysOpRole;
import com.aic.paas.sys.provider.bean.CSysRole;
import com.aic.paas.sys.provider.bean.SysOpRole;
import com.aic.paas.sys.provider.bean.SysRole;
import com.aic.paas.sys.provider.db.SysMenuDao;
import com.aic.paas.sys.provider.db.SysModuDao;
import com.aic.paas.sys.provider.db.SysModuRoleDao;
import com.aic.paas.sys.provider.db.SysOpRoleDao;
import com.aic.paas.sys.provider.db.SysRoleDao;


public abstract class AbstractSysAuth {

		
	@Autowired
	protected SysRoleDao roleDao;
	

	@Autowired
	protected SysOpRoleDao opRoleDao;
	

	@Autowired
	protected SysModuDao moduDao;
	
	
	@Autowired
	protected SysMenuDao menuDao;
	
		
	
	@Autowired
	protected SysModuRoleDao moduRoleDao;
	
	
	
	
	
	/**
	 * 获取指定用户所对应的所有角色ID
	 * @param opId : 指定用户
	 * @return
	 */
	protected Set<Long> getOpRoleIdSet(Long opId) {
		BinaryUtils.checkEmpty(opId, "opId");
		
		CSysOpRole oprolecdt = new CSysOpRole();
		oprolecdt.setOpId(opId);
		List<SysOpRole> oproles = opRoleDao.selectList(oprolecdt, null);
		
		Long[] roleids = new Long[oproles.size()];
		if(roleids.length == 0) return new HashSet<Long>();
		
		for(int i=0; i<roleids.length; i++) {
			SysOpRole role = oproles.get(i);
			roleids[i] = role.getRoleId();
		}
		
		CSysRole rolecdt = new CSysRole();
		rolecdt.setIds(roleids);
		rolecdt.setStatus(1);
		List<SysRole> roles = roleDao.selectList(rolecdt, null);
		
		Set<Long> roleIds = new HashSet<Long>();
		for(int i=0; i<roles.size(); i++) {
			SysRole r = roles.get(i);
			roleIds.add(r.getId());
		}
		
		return roleIds;
	}
	
	
	
	/**
	 * 获取指定用户所对应的所有角色ID
	 * @param opId : 指定用户
	 * @return
	 */
	protected Long[] getOpRoleIds(Long opId) {
		return getOpRoleIdSet(opId).toArray(new Long[0]);
	}
	
	
	
	
	
	
}
