package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysOpRole;
import com.aic.paas.sys.provider.bean.SysOpRole;


/**
 * 操作员角色表[SYS_OP_ROLE]数据访问对象定义实现
 */
public class SysOpRoleDaoDefinition implements DaoDefinition<SysOpRole, CSysOpRole> {


	@Override
	public Class<SysOpRole> getEntityClass() {
		return SysOpRole.class;
	}


	@Override
	public Class<CSysOpRole> getConditionClass() {
		return CSysOpRole.class;
	}


	@Override
	public String getTableName() {
		return "SYS_OP_ROLE";
	}


	@Override
	public boolean hasDataStatusField() {
		return false;
	}


	@Override
	public void setDataStatusValue(SysOpRole record, int status) {
	}


	@Override
	public void setDataStatusValue(CSysOpRole cdt, int status) {
	}


	@Override
	public void setCreatorValue(SysOpRole record, String creator) {
	}


	@Override
	public void setModifierValue(SysOpRole record, String modifier) {
	}


}


