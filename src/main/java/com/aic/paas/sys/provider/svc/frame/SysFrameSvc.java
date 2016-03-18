package com.aic.paas.sys.provider.svc.frame;

import java.util.List;

import com.aic.paas.sys.provider.bean.CSysMenu;
import com.aic.paas.sys.provider.bean.CSysModu;
import com.aic.paas.sys.provider.bean.CSysModuDrop;
import com.aic.paas.sys.provider.bean.CSysModuRes;
import com.aic.paas.sys.provider.bean.CSysOp;
import com.aic.paas.sys.provider.bean.CSysOpRole;
import com.aic.paas.sys.provider.bean.CSysRole;
import com.aic.paas.sys.provider.bean.SysCode;
import com.aic.paas.sys.provider.bean.SysMenu;
import com.aic.paas.sys.provider.bean.SysModu;
import com.aic.paas.sys.provider.bean.SysModuDrop;
import com.aic.paas.sys.provider.bean.SysModuRes;
import com.aic.paas.sys.provider.bean.SysOp;
import com.aic.paas.sys.provider.bean.SysOpRole;
import com.aic.paas.sys.provider.bean.SysRole;
import com.aic.paas.sys.provider.svc.bean.SysCodeBatch;
import com.aic.paas.sys.provider.svc.bean.SysModuInfo;

public interface SysFrameSvc {
	
	
	
	/**
	 * 查询系统代码
	 * @param defCode : 代码定义名称
	 * @param codes : 指定代码
	 * @return
	 */
	public List<SysCode> getCodeList(String defCode, String[] codes);

	 
	
	/**
	 * 批量获取系统代码
	 * @param defCodes
	 * @return
	 */
	public List<SysCodeBatch> getCodeListBatch(String[] defCodes);
	

	
	
	/**
	 * 跟据模块ID获取模块相关信息
	 * @param moduId
	 * @return
	 */
	public SysModuInfo getModuInfoById(Long moduId);

	
	
	/**
	 * 跟据模块代码获取模块相关信息
	 * @param moduId
	 * @return
	 */
	public SysModuInfo getModuInfoByCode(String moduCode);
	
	
	
	
	/**
	 * 不分页查询模块
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 系统模块表[SYS_MODU]查询列表
	 */
	public List<SysModu> getModuList(CSysModu cdt, String orders);
	
	
	
	
	
	/**
	 * 不分页查询模块下拉列表
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 模块代码表[SYS_MODU_DROP]查询列表
	 */
	public List<SysModuDrop> getModuDropList(Long moduId, CSysModuDrop cdt, String orders);

	
	
	
	/**
	 * 不分页查询模块下拉列表
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 模块代码表[SYS_MODU_DROP]查询列表
	 */
	public List<SysModuRes> getModuResList(Long moduId, CSysModuRes cdt, String orders);
	
	
	
	/**
	 * 不分页查询菜单
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 系统模块表[SYS_MODU]查询列表
	 */
	public List<SysMenu> getMenuList(CSysMenu cdt, String orders);
	
	
	
	/**
	 * 跟据ID查询用户
	 * @param loginCode
	 * @return
	 */
	public SysOp getOpById(Long opId);
	
	
	/**
	 * 跟据用户代码查询用户
	 * @param loginCode
	 * @return
	 */
	public SysOp getOpByCode(String opCode);
	
	
	/**
	 * 跟据登录代码查询用户
	 * @param loginCode
	 * @return
	 */
	public SysOp getOpByLoginCode(String loginCode);
	
	
	
	/**
	 * 跟据登录代码查询用户
	 * @param orders
	 * @return
	 */
	public List<SysOp> getOpList(CSysOp cdt, String orders);
	
	
	
	/**
	 * 更新用户登录密码
	 * @param opId : 用户ID
	 * @param oldPwd : 旧密码
	 * @param newPwd : 新密码
	 */
	public Integer updateOpPwd(Long opId, String oldPwd, String newPwd);
	
	
	
	
	/**
	 * 获取用户角色
	 * @param cdt
	 * @param orders
	 * @return
	 */
	public List<SysOpRole> getOpRoles(Long opId, CSysOpRole cdt, String orders);
	
	
	
	
	/**
	 * 获取角色列表
	 * @param cdt
	 * @param orders
	 * @return
	 */
	public List<SysRole> getRoleList(CSysRole cdt, String orders);
	
	
	
	
	/**
	 * 设置用户登录日志
	 * @param op
	 * @param authCode : 登录权限认证码
	 */
	public void setOpLoginLog(SysOp op, String authCode, String sessionId);
	
	
	
	/**
	 * 设置用户登出日志
	 * @param op
	 * @param authCode : 登录权限认证码
	 */
	public void setOpLogoutLog(Long opId, String sessionId);
	
	
	
	
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
