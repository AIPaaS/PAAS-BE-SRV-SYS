package com.aic.paas.sys.provider.svc.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.jdbc.Page;
import com.aic.paas.sys.provider.bean.CSysOrg;
import com.aic.paas.sys.provider.bean.SysOrg;
import com.aic.paas.sys.provider.db.SysOrgDao;
import com.aic.paas.sys.provider.svc.base.SysOrgSvc;

public class SysOrgSvcImpl implements SysOrgSvc {
	
	
	@Autowired
	SysOrgDao sysOrgDao;
	
	

	@Override
	public Page<SysOrg> queryPage(Integer pageNum, Integer pageSize, CSysOrg cdt, String orders) {
		return sysOrgDao.selectPage(pageNum, pageSize, cdt, orders);
	}
	
	

	@Override
	public List<SysOrg> queryList(CSysOrg cdt, String orders) {
		return sysOrgDao.selectList(cdt, orders);
	}
	
	

	@Override
	public long queryCount(CSysOrg cdt) {
		return sysOrgDao.selectCount(cdt);
	}

	
	
	
	@Override
	public SysOrg queryById(Long id) {
		return sysOrgDao.selectById(id);
	}
	
	

}
