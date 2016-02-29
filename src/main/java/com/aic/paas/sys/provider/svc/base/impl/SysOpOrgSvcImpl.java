package com.aic.paas.sys.provider.svc.base.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.core.util.BinaryUtils;
import com.aic.paas.sys.provider.bean.CSysOpOrg;
import com.aic.paas.sys.provider.bean.SysOpOrg;
import com.aic.paas.sys.provider.db.SysOpOrgDao;
import com.aic.paas.sys.provider.svc.base.SysOpOrgSvc;

public class SysOpOrgSvcImpl implements SysOpOrgSvc {
	
	
	@Autowired
	private SysOpOrgDao sysOpOrgDao;
	
	

	@Override
	public List<SysOpOrg> queryListByOpId(Long opId, CSysOpOrg cdt, String orders) {
		BinaryUtils.checkEmpty(opId, "opId");
		if(cdt == null) cdt = new CSysOpOrg();
		cdt.setOpId(opId);
		return sysOpOrgDao.selectList(cdt, orders);
	}
	
	
	
	@Override
	public List<SysOpOrg> queryListByOrgId(Long orgId, CSysOpOrg cdt, String orders) {
		BinaryUtils.checkEmpty(orgId, "orgId");
		if(cdt == null) cdt = new CSysOpOrg();
		cdt.setOrgId(orgId);
		return sysOpOrgDao.selectList(cdt, orders);
	}
	
	
	

	@Override
	public void addOpOrgs(Long opId, Long[] orgIds) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(orgIds, "orgIds");
		
		removeOpOrgs(opId, orgIds);
		
		List<SysOpOrg> records = new ArrayList<SysOpOrg>();
		for(int i=0; i<orgIds.length; i++) {
			SysOpOrg r = new SysOpOrg();
			r.setOpId(opId);
			r.setOrgId(orgIds[i]);
			r.setDirectFlag(0);
			r.setAdminFlag(0);
			r.setStatus(1);
			records.add(r);
		}
		
		sysOpOrgDao.insertBatch(records);
	}

	
	
	@Override
	public void removeOpOrgs(Long opId, Long[] orgIds) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(orgIds, "orgIds");
		
		CSysOpOrg cdt = new CSysOpOrg();
		cdt.setOpId(opId);
		cdt.setOrgIds(orgIds);
		sysOpOrgDao.deleteByCdt(cdt);
	}
	
	
	
	

	@Override
	public Integer setDirectOrg(Long opId, Long orgId) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(orgId, "orgId");
		
		CSysOpOrg cdt = new CSysOpOrg();
		cdt.setOpId(opId);
		
		SysOpOrg record = new SysOpOrg();
		record.setDirectFlag(0);
		
		sysOpOrgDao.updateByCdt(record, cdt);
		
		cdt.setOrgId(opId);
		record.setDirectFlag(1);
		
		return sysOpOrgDao.updateByCdt(record, cdt);
	}
	
	
	
	

	@Override
	public Integer setAdminOrg(Long opId, Long orgId) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(orgId, "orgId");
		
		CSysOpOrg cdt = new CSysOpOrg();
		cdt.setOpId(opId);
		
		SysOpOrg record = new SysOpOrg();
		record.setAdminFlag(0);
		
		sysOpOrgDao.updateByCdt(record, cdt);
		
		cdt.setOrgId(opId);
		record.setAdminFlag(1);
		
		return sysOpOrgDao.updateByCdt(record, cdt);
	}




	

}
