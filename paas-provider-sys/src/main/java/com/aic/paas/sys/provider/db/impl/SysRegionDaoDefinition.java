package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysRegion;
import com.aic.paas.sys.provider.bean.SysRegion;


/**
 * 区域表[SYS_REGION]数据访问对象定义实现
 */
public class SysRegionDaoDefinition implements DaoDefinition<SysRegion, CSysRegion> {


	@Override
	public Class<SysRegion> getEntityClass() {
		return SysRegion.class;
	}


	@Override
	public Class<CSysRegion> getConditionClass() {
		return CSysRegion.class;
	}


	@Override
	public String getTableName() {
		return "SYS_REGION";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysRegion record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysRegion cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysRegion record, String creator) {
	}


	@Override
	public void setModifierValue(SysRegion record, String modifier) {
	}


}


