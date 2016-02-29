package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysModu;
import com.aic.paas.sys.provider.bean.SysModu;


/**
 * 系统模块表[SYS_MODU]数据访问对象定义实现
 */
public class SysModuDaoDefinition implements DaoDefinition<SysModu, CSysModu> {


	@Override
	public Class<SysModu> getEntityClass() {
		return SysModu.class;
	}


	@Override
	public Class<CSysModu> getConditionClass() {
		return CSysModu.class;
	}


	@Override
	public String getTableName() {
		return "SYS_MODU";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysModu record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysModu cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysModu record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysModu record, String modifier) {
		record.setModifier(modifier);
	}


}


