package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysOp;
import com.aic.paas.sys.provider.bean.SysOp;


/**
 * 操作员表[SYS_OP]数据访问对象定义实现
 */
public class SysOpDaoDefinition implements DaoDefinition<SysOp, CSysOp> {


	@Override
	public Class<SysOp> getEntityClass() {
		return SysOp.class;
	}


	@Override
	public Class<CSysOp> getConditionClass() {
		return CSysOp.class;
	}


	@Override
	public String getTableName() {
		return "SYS_OP";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysOp record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysOp cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysOp record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysOp record, String modifier) {
		record.setModifier(modifier);
	}


}


