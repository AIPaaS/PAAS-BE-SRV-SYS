package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysRole;
import com.aic.paas.sys.provider.bean.SysRole;


/**
 * 角色表[SYS_ROLE]数据访问对象定义实现
 */
public class SysRoleDaoDefinition implements DaoDefinition<SysRole, CSysRole> {


	@Override
	public Class<SysRole> getEntityClass() {
		return SysRole.class;
	}


	@Override
	public Class<CSysRole> getConditionClass() {
		return CSysRole.class;
	}


	@Override
	public String getTableName() {
		return "SYS_ROLE";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysRole record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysRole cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysRole record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysRole record, String modifier) {
		record.setModifier(modifier);
	}


}


