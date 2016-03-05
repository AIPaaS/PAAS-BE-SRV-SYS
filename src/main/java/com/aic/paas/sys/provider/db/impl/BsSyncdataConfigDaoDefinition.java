package com.aic.paas.sys.provider.db.impl;


import com.aic.paas.sys.provider.bean.BsSyncdataConfig;
import com.aic.paas.sys.provider.bean.CBsSyncdataConfig;
import com.binary.framework.dao.DaoDefinition;



/**
 * 数据同步定义表[BS_SYNCDATA_CONFIG]数据访问对象定义实现
 */
public class BsSyncdataConfigDaoDefinition implements DaoDefinition<BsSyncdataConfig, CBsSyncdataConfig> {


	@Override
	public Class<BsSyncdataConfig> getEntityClass() {
		return BsSyncdataConfig.class;
	}


	@Override
	public Class<CBsSyncdataConfig> getConditionClass() {
		return CBsSyncdataConfig.class;
	}


	@Override
	public String getTableName() {
		return "BS_SYNCDATA_CONFIG";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(BsSyncdataConfig record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CBsSyncdataConfig cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(BsSyncdataConfig record, String creator) {
	}


	@Override
	public void setModifierValue(BsSyncdataConfig record, String modifier) {
	}


}


