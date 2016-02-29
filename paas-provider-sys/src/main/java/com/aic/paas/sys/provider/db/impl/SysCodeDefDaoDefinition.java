package com.aic.paas.sys.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;
import com.aic.paas.sys.provider.bean.CSysCodeDef;
import com.aic.paas.sys.provider.bean.SysCodeDef;


/**
 * 代码定义表[SYS_CODE_DEF]数据访问对象定义实现
 */
public class SysCodeDefDaoDefinition implements DaoDefinition<SysCodeDef, CSysCodeDef> {


	@Override
	public Class<SysCodeDef> getEntityClass() {
		return SysCodeDef.class;
	}


	@Override
	public Class<CSysCodeDef> getConditionClass() {
		return CSysCodeDef.class;
	}


	@Override
	public String getTableName() {
		return "SYS_CODE_DEF";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(SysCodeDef record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CSysCodeDef cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(SysCodeDef record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(SysCodeDef record, String modifier) {
		record.setModifier(modifier);
	}


}


