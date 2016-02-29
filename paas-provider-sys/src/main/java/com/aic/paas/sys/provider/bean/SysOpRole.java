package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 操作员角色表[SYS_OP_ROLE]
 */
public class SysOpRole implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 操作员ID[OP_ID]
	 */
	private Long opId;


	/**
	 * mapping-field: 角色ID[ROLE_ID]
	 */
	private Long roleId;


	/**
	 * mapping-field: 是否主角色[IS_MASTER]
	 * 1=主角色 0=非主角色
	 */
	private Integer isMaster;


	/**
	 * mapping-field: 创建时间[CREATE_TIME]
	 * yyyyMMddHHmmss
	 */
	private Long createTime;


	/**
	 * mapping-field: 修改时间[MODIFY_TIME]
	 * yyyyMMddHHmmss
	 */
	private Long modifyTime;




	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public Long getOpId() {
		return this.opId;
	}
	public void setOpId(Long opId) {
		this.opId = opId;
	}


	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public Integer getIsMaster() {
		return this.isMaster;
	}
	public void setIsMaster(Integer isMaster) {
		this.isMaster = isMaster;
	}


	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}


	public Long getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}


}


