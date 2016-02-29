package com.aic.paas.sys.provider.svc.base.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.core.util.BinaryUtils;
import com.aic.paas.sys.provider.bean.CSysModuRole;
import com.aic.paas.sys.provider.bean.SysModuRole;
import com.aic.paas.sys.provider.db.SysModuRoleDao;
import com.aic.paas.sys.provider.svc.base.SysModuRoleSvc;


/**
 * SysModuRole服务实现
 */
public class SysModuRoleSvcImpl implements SysModuRoleSvc {


	@Autowired
	private SysModuRoleDao sysModuRoleDao;

	
	
	@Override
	public List<SysModuRole> queryListByRoleId(Long roleId, CSysModuRole cdt, String orders) {
		BinaryUtils.checkEmpty(roleId, "roleId");
		if(cdt == null) cdt = new CSysModuRole();
		cdt.setRoleId(roleId);
		return sysModuRoleDao.selectList(cdt, orders);
	}

	
	
	
	@Override
	public void addRoleModus(Long roleId, Long[] moduIds) {
		BinaryUtils.checkEmpty(roleId, "roleId");
		BinaryUtils.checkEmpty(moduIds, "moduIds");
		
		removeRoleModus(roleId, moduIds);
		
		List<SysModuRole> records = new ArrayList<SysModuRole>();
		for(int i=0; i<moduIds.length; i++) {
			SysModuRole r = new SysModuRole();
			r.setRoleId(roleId);
			r.setModuId(moduIds[i]);
			records.add(r);
		}
		
		sysModuRoleDao.insertBatch(records);
	}

	
	
	
	
	@Override
	public void removeRoleModus(Long roleId, Long[] moduIds) {
		BinaryUtils.checkEmpty(roleId, "roleId");
		BinaryUtils.checkEmpty(moduIds, "moduIds");
		
		CSysModuRole cdt = new CSysModuRole();
		cdt.setRoleId(roleId);
		cdt.setModuIds(moduIds);
		sysModuRoleDao.deleteByCdt(cdt);
	}


	
	
	

}


