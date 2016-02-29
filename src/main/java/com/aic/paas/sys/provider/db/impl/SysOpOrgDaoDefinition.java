package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysOpOrg;
import com.aic.paas.sys.provider.bean.SysOpOrg;


/**
 * 操作员组织表[SYS_OP_ORG]数据访问对象定义实现
 */
public class SysOpOrgDaoDefinition implements DaoDefinition<SysOpOrg, CSysOpOrg> {


	@Override
	public Class<SysOpOrg> getEntityClass() {
		return SysOpOrg.class;
	}


	@Override
	public Class<CSysOpOrg> getConditionClass() {
		return CSysOpOrg.class;
	}


	@Override
	public String getTableName() {
		return "SYS_OP_ORG";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysOpOrg record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysOpOrg cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysOpOrg record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysOpOrg record, String modifier) {
		record.setModifier(modifier);
	}


}


