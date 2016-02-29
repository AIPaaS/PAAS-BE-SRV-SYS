package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysCode;
import com.aic.paas.sys.provider.bean.SysCode;


/**
 * 系统代码表[SYS_CODE]数据访问对象定义实现
 */
public class SysCodeDaoDefinition implements DaoDefinition<SysCode, CSysCode> {


	@Override
	public Class<SysCode> getEntityClass() {
		return SysCode.class;
	}


	@Override
	public Class<CSysCode> getConditionClass() {
		return CSysCode.class;
	}


	@Override
	public String getTableName() {
		return "SYS_CODE";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysCode record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysCode cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysCode record, String creator) {
	}


	@Override
	public void setModifierValue(SysCode record, String modifier) {
	}


}


