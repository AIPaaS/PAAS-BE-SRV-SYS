package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysModuRole;
import com.aic.paas.sys.provider.bean.SysModuRole;


/**
 * 模块角色表[SYS_MODU_ROLE]数据访问对象定义实现
 */
public class SysModuRoleDaoDefinition implements DaoDefinition<SysModuRole, CSysModuRole> {


	@Override
	public Class<SysModuRole> getEntityClass() {
		return SysModuRole.class;
	}


	@Override
	public Class<CSysModuRole> getConditionClass() {
		return CSysModuRole.class;
	}


	@Override
	public String getTableName() {
		return "SYS_MODU_ROLE";
	}


	@Override
	public boolean hasDataStatusField() {
		return false;
	}


	@Override
	public void setDataStatusValue(SysModuRole record, int status) {
	}


	@Override
	public void setDataStatusValue(CSysModuRole cdt, int status) {
	}


	@Override
	public void setCreatorValue(SysModuRole record, String creator) {
	}


	@Override
	public void setModifierValue(SysModuRole record, String modifier) {
	}


}


