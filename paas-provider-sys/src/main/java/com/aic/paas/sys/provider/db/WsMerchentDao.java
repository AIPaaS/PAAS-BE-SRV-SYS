package com.aic.paas.sys.provider.db;


import java.util.List;

import com.aic.paas.sys.provider.bean.CWsMerchent;
import com.aic.paas.sys.provider.bean.SysMenu;
import com.aic.paas.sys.provider.bean.WsMerchent;
import com.binary.framework.dao.Dao;


/**
 * 租户信息表[WS_MERCHENT]数据访问对象
 */
public interface WsMerchentDao extends Dao<WsMerchent, CWsMerchent> {

	
	
	
	
	/**
	 * 查询角色对应菜单
	 * @param roleIds
	 * @return 借用字段createTime为角色ID
	 */
	public List<SysMenu> selectRoleMenus(Long[] roleIds);
	

	
	
	
	
}


