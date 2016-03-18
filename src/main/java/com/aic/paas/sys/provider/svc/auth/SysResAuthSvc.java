package com.aic.paas.sys.provider.svc.auth;

import java.util.List;

import com.aic.paas.sys.provider.bean.CSysMenu;
import com.aic.paas.sys.provider.bean.CSysModu;
import com.aic.paas.sys.provider.bean.SysMenu;
import com.aic.paas.sys.provider.bean.SysModu;


/**
 * 系统资源权限服务 (模块、模块)
 * @author wanwb
 */
public interface SysResAuthSvc {
	
	
	
	/**
	 * 获取指定用户下所有模块
	 * @param opId : 指定用户
	 * @param cdt : 指定查询条件
	 * @param orders : 排序
	 * @param beeauth : 是否带权限空制, 缺省为true
	 * @return
	 */
	public List<SysModu> getAllModus(Long opId, CSysModu cdt, String orders, Boolean beeauth);
	
	
	
	
	/**
	 * 获取指定用户下所有模块ID
	 * @param opId : 指定用户
	 * @param cdt : 指定查询条件
	 * @param orders : 排序
	 * @param beeauth : 是否带权限空制, 缺省为true
	 * @return
	 */
	public Long[] getAllModuIds(Long opId, CSysModu cdt, String orders, Boolean beeauth);
	
	
	
	
	
	/**
	 * 获取指定用户下所有菜单
	 * @param opId : 指定用户
	 * @param cdt : 指定查询条件
	 * @param orders : 排序
	 * @param beeauth : 是否带权限空制, 缺省为true
	 * @return
	 */
	public List<SysMenu> getAllMenus(Long opId, CSysMenu cdt, String orders, Boolean beeauth);
	
	
	
	
	
		
	/**
	 * 验证用户是否具有指定模块的权限
	 * @param opId : 用户ID
	 * @param moduId : 被验证的模块
	 * @return
	 */
	public boolean verifyModuId(Long opId, Long moduId);
	
	
	
	
	/**
	 * 验证用户是否具有指定模块的权限
	 * @param opId : 用户ID
	 * @param modu : 被验证的模块
	 * @return
	 */
	public boolean verifyModu(Long opId, SysModu modu);




	/**
	 * 验证用户是否具有指定模块的权限
	 * @param opId : 用户ID
	 * @param moduCode : 被验证的模块编码
	 * @return
	 */
	public boolean verifyModuCode(Long opId, String moduCode);
	
	
	
}
