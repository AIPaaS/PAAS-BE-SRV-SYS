package com.aic.paas.sys.provider.db.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.binary.core.util.BinaryUtils;
import com.binary.framework.dao.support.tpl.IBatisDaoTemplate;
import com.binary.framework.ibatis.IBatisUtils;
import com.binary.jdbc.Page;
import com.aic.paas.sys.provider.bean.CSysOp;
import com.aic.paas.sys.provider.bean.SysOp;
import com.aic.paas.sys.provider.db.SysOpDao;


/**
 * 操作员表[SYS_OP]数据访问对象实现
 */
public class SysOpDaoImpl extends IBatisDaoTemplate<SysOp, CSysOp> implements SysOpDao {

	
	
	
	@Override
	public Page<SysOp> selectPageByOrg(Integer pageNum, Integer pageSize, Long orgId, Boolean direct, Boolean admin, CSysOp cdt, String orders) {
		BinaryUtils.checkEmpty(orgId, "orgId");
		
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		
		map.put("orgId", orgId);
		if(direct != null) map.put("directFlag", direct.booleanValue()?1:0);
		if(admin != null) map.put("adminFlag", admin.booleanValue()?1:0);
		
		Page<SysOp> page = IBatisUtils.selectPage(getSqlMapClientTemplate(), getTableName()+".selectListByOrg", map, pageNum, pageSize, true);
		return page;
	}

	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SysOp> selectListByOrg(Long orgId, Boolean direct, Boolean admin, CSysOp cdt, String orders) {
		BinaryUtils.checkEmpty(orgId, "orgId");
		
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		
		map.put("orgId", orgId);
		if(direct != null) map.put("directFlag", direct.booleanValue()?1:0);
		if(admin != null) map.put("adminFlag", admin.booleanValue()?1:0);
		
		List<SysOp> list = getSqlMapClientTemplate().queryForList(getTableName()+".selectListByOrg", map);
		return list;
	}

	
	
	

}


