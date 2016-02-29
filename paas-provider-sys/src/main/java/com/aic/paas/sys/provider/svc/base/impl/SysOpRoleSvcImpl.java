package com.aic.paas.sys.provider.svc.base.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.core.util.BinaryUtils;
import com.aic.paas.sys.provider.bean.CSysOpRole;
import com.aic.paas.sys.provider.bean.SysOpRole;
import com.aic.paas.sys.provider.db.SysOpRoleDao;
import com.aic.paas.sys.provider.svc.base.SysOpRoleSvc;


/**
 * SysOpRole服务实现
 */
public class SysOpRoleSvcImpl implements SysOpRoleSvc {


	@Autowired
	private SysOpRoleDao sysOpRoleDao;

	
	
	
	@Override
	public List<SysOpRole> queryListByOpId(Long opId, CSysOpRole cdt, String orders) {
		BinaryUtils.checkEmpty(opId, "opId");
		if(cdt == null) cdt = new CSysOpRole();
		cdt.setOpId(opId);
		return sysOpRoleDao.selectList(cdt, orders);
	}

	
	
	@Override
	public void addOpRoles(Long opId, Long[] roleIds) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(roleIds, "roleIds");
		
		removeOpRoles(opId, roleIds);
		
		List<SysOpRole> records = new ArrayList<SysOpRole>();
		for(int i=0; i<roleIds.length; i++) {
			SysOpRole r = new SysOpRole();
			r.setOpId(opId);
			r.setRoleId(roleIds[i]);
			r.setIsMaster(0);
			records.add(r);
		}
		
		sysOpRoleDao.insertBatch(records);
	}
	
	

	@Override
	public void removeOpRoles(Long opId, Long[] roleIds) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(roleIds, "roleIds");
		
		CSysOpRole cdt = new CSysOpRole();
		cdt.setOpId(opId);
		cdt.setRoleIds(roleIds);
		sysOpRoleDao.deleteByCdt(cdt);
	}
	
	
	
	

	@Override
	public Integer setMasterRole(Long opId, Long roleId) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(roleId, "roleId");
		
		CSysOpRole cdt = new CSysOpRole();
		cdt.setOpId(opId);
		
		SysOpRole record = new SysOpRole();
		record.setIsMaster(0);
		
		sysOpRoleDao.updateByCdt(record, cdt);
		
		cdt.setRoleId(roleId);
		record.setIsMaster(1);
		
		return sysOpRoleDao.updateByCdt(record, cdt);
	}


	
	
	
	


}


