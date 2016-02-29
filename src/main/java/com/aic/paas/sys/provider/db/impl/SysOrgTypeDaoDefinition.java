package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysOrgType;
import com.aic.paas.sys.provider.bean.SysOrgType;


/**
 * 组织类型表[SYS_ORG_TYPE]数据访问对象定义实现
 */
public class SysOrgTypeDaoDefinition implements DaoDefinition<SysOrgType, CSysOrgType> {


	@Override
	public Class<SysOrgType> getEntityClass() {
		return SysOrgType.class;
	}


	@Override
	public Class<CSysOrgType> getConditionClass() {
		return CSysOrgType.class;
	}


	@Override
	public String getTableName() {
		return "SYS_ORG_TYPE";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysOrgType record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysOrgType cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysOrgType record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysOrgType record, String modifier) {
		record.setModifier(modifier);
	}


}


