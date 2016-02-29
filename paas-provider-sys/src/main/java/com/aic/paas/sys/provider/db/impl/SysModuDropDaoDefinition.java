package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysModuDrop;
import com.aic.paas.sys.provider.bean.SysModuDrop;


/**
 * 模块代码表[SYS_MODU_DROP]数据访问对象定义实现
 */
public class SysModuDropDaoDefinition implements DaoDefinition<SysModuDrop, CSysModuDrop> {


	@Override
	public Class<SysModuDrop> getEntityClass() {
		return SysModuDrop.class;
	}


	@Override
	public Class<CSysModuDrop> getConditionClass() {
		return CSysModuDrop.class;
	}


	@Override
	public String getTableName() {
		return "SYS_MODU_DROP";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysModuDrop record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysModuDrop cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysModuDrop record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysModuDrop record, String modifier) {
		record.setModifier(modifier);
	}


}


