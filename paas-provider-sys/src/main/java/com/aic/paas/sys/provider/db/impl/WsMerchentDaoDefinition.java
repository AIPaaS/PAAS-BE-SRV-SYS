package com.aic.paas.sys.provider.db.impl;


import com.aic.paas.sys.provider.bean.CWsMerchent;
import com.aic.paas.sys.provider.bean.WsMerchent;
import com.binary.framework.dao.DaoDefinition;


/**
 * 租户信息表[WS_MERCHENT]数据访问对象定义实现
 */
public class WsMerchentDaoDefinition implements DaoDefinition<WsMerchent, CWsMerchent> {


	@Override
	public Class<WsMerchent> getEntityClass() {
		return WsMerchent.class;
	}


	@Override
	public Class<CWsMerchent> getConditionClass() {
		return CWsMerchent.class;
	}


	@Override
	public String getTableName() {
		return "WS_MERCHENT";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(WsMerchent record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CWsMerchent cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(WsMerchent record, String creator) {
	}


	@Override
	public void setModifierValue(WsMerchent record, String modifier) {
	}


}


