package com.aic.paas.sys.provider.db;


import java.util.List;

import com.binary.framework.dao.Dao;
import com.binary.jdbc.Page;
import com.aic.paas.sys.provider.bean.CSysOp;
import com.aic.paas.sys.provider.bean.SysOp;


/**
 * 操作员表[SYS_OP]数据访问对象
 */
public interface SysOpDao extends Dao<SysOp, CSysOp> {


	
	/**
	 * 分页查询指定组织下的用户
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param orgId 指定组织
	 * @param direct 是否直属组织, 为null表示不区分
	 * @param admin 是否管理员, 为null表示不区分
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 操作员表[SYS_OP]分页列表对象
	 */
	public Page<SysOp> selectPageByOrg(Integer pageNum, Integer pageSize, Long orgId, Boolean direct, Boolean admin, CSysOp cdt, String orders);
	
	
	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 操作员表[SYS_OP]查询列表
	 */
	public List<SysOp> selectListByOrg(Long orgId, Boolean direct, Boolean admin, CSysOp cdt, String orders);
	
	
}


