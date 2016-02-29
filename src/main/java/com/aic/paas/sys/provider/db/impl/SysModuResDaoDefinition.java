package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysModuRes;
import com.aic.paas.sys.provider.bean.SysModuRes;


/**
 * 模块资源表[SYS_MODU_RES]数据访问对象定义实现
 */
public class SysModuResDaoDefinition implements DaoDefinition<SysModuRes, CSysModuRes> {


	@Override
	public Class<SysModuRes> getEntityClass() {
		return SysModuRes.class;
	}


	@Override
	public Class<CSysModuRes> getConditionClass() {
		return CSysModuRes.class;
	}


	@Override
	public String getTableName() {
		return "SYS_MODU_RES";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysModuRes record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysModuRes cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysModuRes record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysModuRes record, String modifier) {
		record.setModifier(modifier);
	}


}


