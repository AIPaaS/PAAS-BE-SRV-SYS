package com.aic.paas.sys.provider.svc.base.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;
import com.aic.paas.sys.provider.bean.CSysRole;
import com.aic.paas.sys.provider.bean.SysRole;
import com.aic.paas.sys.provider.db.SysRoleDao;
import com.aic.paas.sys.provider.svc.base.SysRoleSvc;


/**
 * SysRole服务实现
 */
public class SysRoleSvcImpl implements SysRoleSvc {


	@Autowired
	private SysRoleDao sysRoleDao;


	
	@Override
	public Page<SysRole> queryPage(Integer pageNum, Integer pageSize, CSysRole cdt, String orders) {
		return sysRoleDao.selectPage(pageNum, pageSize, cdt, orders);
	}


	
	@Override
	public List<SysRole> queryList(CSysRole cdt, String orders) {
		return sysRoleDao.selectList(cdt, orders);
	}


	@Override
	public long queryCount(CSysRole cdt) {
		return sysRoleDao.selectCount(cdt);
	}


	@Override
	public SysRole queryById(Long id) {
		return sysRoleDao.selectById(id);
	}


	@Override
	public Integer updateById(SysRole record, Long id) {
		return sysRoleDao.updateById(record, id);
	}


	@Override
	public Integer updateByCdt(SysRole record, CSysRole cdt) {
		return sysRoleDao.updateByCdt(record, cdt);
	}



	@Override
	public Long saveOrUpdate(SysRole record) {
		Long id = record.getId();
		
		boolean isadd = id == null;
		String roleCode = record.getRoleCode();
		
		BinaryUtils.checkEmpty(roleCode, "record.roleCode");
		CSysRole cdt = new CSysRole();
		cdt.setRoleCode(roleCode);
		List<SysRole> list = sysRoleDao.selectList(cdt, null);
		String msg = " is exists record.roleCode '"+roleCode+"'! ";
		if(isadd) {
			if(list.size() > 0) throw new ServiceException(msg);
		}else {
			if(list.size() > 2) throw new ServiceException(msg);
			if(list.size()==1 && !list.get(0).getId().equals(id)) throw new ServiceException(msg);
		}
		
		if(isadd) {
			id = sysRoleDao.insert(record);
		}else {
			sysRoleDao.updateById(record, id);
		}
		return id;
	}


	
	
}


