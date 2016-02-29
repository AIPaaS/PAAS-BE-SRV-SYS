package com.aic.paas.sys.provider.db.impl;


import java.util.List;

import com.aic.paas.sys.provider.bean.CWsMerchent;
import com.aic.paas.sys.provider.bean.SysMenu;
import com.aic.paas.sys.provider.bean.WsMerchent;
import com.aic.paas.sys.provider.db.WsMerchentDao;
import com.binary.core.lang.Conver;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.dao.support.tpl.IBatisDaoTemplate;
import com.binary.jdbc.JdbcOperator;


/**
 * 租户信息表[WS_MERCHENT]数据访问对象实现
 */
public class WsMerchentDaoImpl extends IBatisDaoTemplate<WsMerchent, CWsMerchent> implements WsMerchentDao {

	
	
	
	@Override
	public List<SysMenu> selectRoleMenus(Long[] roleIds) {
		BinaryUtils.checkEmpty(roleIds, "roleIds");
		
		StringBuilder sb = new StringBuilder();
		sb.append(" select distinct a.id id, a.menu_code menuCode, a.menu_name menuName, a.parent_id parentId, ")
			.append("         a.modu_id moduId, a.menu_type menuType, a.menu_desc menuDesc, a.menu_img menuImg, ")
			.append("         a.order_no orderNo, a.is_leaf isLeaf, a.is_dir isDir, a.menu_level menuLevel, ")
			.append("         a.menu_lvl_path menuLvlPath, a.status status, a.data_status dataStatus, ")
			.append("         a.creator creator, a.modifier modifier, a.modify_time modifyTime, ")
			.append("         d.id createTime ")
			.append("        from SYS_MENU a ")
			.append("             inner join SYS_MODU b on a.modu_id=b.id and b.data_status=1 and b.status=1 and b.modu_type=2 ")
			.append("             inner join SYS_MODU_ROLE c on b.id=c.modu_id ")
			.append("             inner join SYS_ROLE d on d.data_status=1 and d.status=1 and d.role_type=2 and d.id in (").append(Conver.toString(roleIds)).append(")")
			.append("        where a.data_status=1 and a.status=1 and a.menu_type=2 ")
			.append("        order by a.order_no,a.menu_code ");

		JdbcOperator jo = getJdbcOperator();	
		List<SysMenu> ls = jo.executeQuery(sb.toString(), SysMenu.class);
		return ls;
	}


}


