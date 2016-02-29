package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysLoginLog;
import com.aic.paas.sys.provider.bean.SysLoginLog;


/**
 * 用户登录日志[SYS_LOGIN_LOG]数据访问对象定义实现
 */
public class SysLoginLogDaoDefinition implements DaoDefinition<SysLoginLog, CSysLoginLog> {


	@Override
	public Class<SysLoginLog> getEntityClass() {
		return SysLoginLog.class;
	}


	@Override
	public Class<CSysLoginLog> getConditionClass() {
		return CSysLoginLog.class;
	}


	@Override
	public String getTableName() {
		return "SYS_LOGIN_LOG";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysLoginLog record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysLoginLog cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysLoginLog record, String creator) {
	}


	@Override
	public void setModifierValue(SysLoginLog record, String modifier) {
	}


}


