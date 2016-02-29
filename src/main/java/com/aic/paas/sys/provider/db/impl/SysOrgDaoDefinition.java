package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysOrg;
import com.aic.paas.sys.provider.bean.SysOrg;


/**
 * 组织表[SYS_ORG]数据访问对象定义实现
 */
public class SysOrgDaoDefinition implements DaoDefinition<SysOrg, CSysOrg> {


	@Override
	public Class<SysOrg> getEntityClass() {
		return SysOrg.class;
	}


	@Override
	public Class<CSysOrg> getConditionClass() {
		return CSysOrg.class;
	}


	@Override
	public String getTableName() {
		return "SYS_ORG";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysOrg record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysOrg cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysOrg record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysOrg record, String modifier) {
		record.setModifier(modifier);
	}


}


