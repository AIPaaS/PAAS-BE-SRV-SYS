package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysMenu;
import com.aic.paas.sys.provider.bean.SysMenu;


/**
 * 系统菜单表[SYS_MENU]数据访问对象定义实现
 */
public class SysMenuDaoDefinition implements DaoDefinition<SysMenu, CSysMenu> {


	@Override
	public Class<SysMenu> getEntityClass() {
		return SysMenu.class;
	}


	@Override
	public Class<CSysMenu> getConditionClass() {
		return CSysMenu.class;
	}


	@Override
	public String getTableName() {
		return "SYS_MENU";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysMenu record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysMenu cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysMenu record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysMenu record, String modifier) {
		record.setModifier(modifier);
	}


}


