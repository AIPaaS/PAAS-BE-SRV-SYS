package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 操作员角色表[SYS_OP_ROLE]
 */
public class CSysOpRole implements Condition {
	private static final long serialVersionUID = 1L;


	/**
	 * condition-field: ID[ID] operate-Equal[=]
	 */
	private Long id;


	/**
	 * condition-field: ID[ID] operate-In[in]
	 */
	private Long[] ids;


	/**
	 * condition-field: ID[ID] operate-GTEqual[>=]
	 */
	private Long startId;

	/**
	 * condition-field: ID[ID] operate-LTEqual[<=]
	 */
	private Long endId;


	/**
	 * condition-field: 操作员ID[OP_ID] operate-Equal[=]
	 */
	private Long opId;


	/**
	 * condition-field: 操作员ID[OP_ID] operate-In[in]
	 */
	private Long[] opIds;


	/**
	 * condition-field: 操作员ID[OP_ID] operate-GTEqual[>=]
	 */
	private Long startOpId;

	/**
	 * condition-field: 操作员ID[OP_ID] operate-LTEqual[<=]
	 */
	private Long endOpId;


	/**
	 * condition-field: 角色ID[ROLE_ID] operate-Equal[=]
	 */
	private Long roleId;


	/**
	 * condition-field: 角色ID[ROLE_ID] operate-In[in]
	 */
	private Long[] roleIds;


	/**
	 * condition-field: 角色ID[ROLE_ID] operate-GTEqual[>=]
	 */
	private Long startRoleId;

	/**
	 * condition-field: 角色ID[ROLE_ID] operate-LTEqual[<=]
	 */
	private Long endRoleId;


	/**
	 * condition-field: 是否主角色[IS_MASTER] operate-Equal[=]
	 * 1=主角色 0=非主角色
	 */
	private Integer isMaster;


	/**
	 * condition-field: 是否主角色[IS_MASTER] operate-In[in]
	 * 1=主角色 0=非主角色
	 */
	private Integer[] isMasters;


	/**
	 * condition-field: 是否主角色[IS_MASTER] operate-GTEqual[>=]
	 * 1=主角色 0=非主角色
	 */
	private Integer startIsMaster;

	/**
	 * condition-field: 是否主角色[IS_MASTER] operate-LTEqual[<=]
	 * 1=主角色 0=非主角色
	 */
	private Integer endIsMaster;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-Equal[=]
	 * yyyyMMddHHmmss
	 */
	private Long createTime;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-In[in]
	 * yyyyMMddHHmmss
	 */
	private Long[] createTimes;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-GTEqual[>=]
	 * yyyyMMddHHmmss
	 */
	private Long startCreateTime;

	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-LTEqual[<=]
	 * yyyyMMddHHmmss
	 */
	private Long endCreateTime;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-Equal[=]
	 * yyyyMMddHHmmss
	 */
	private Long modifyTime;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-In[in]
	 * yyyyMMddHHmmss
	 */
	private Long[] modifyTimes;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-GTEqual[>=]
	 * yyyyMMddHHmmss
	 */
	private Long startModifyTime;

	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-LTEqual[<=]
	 * yyyyMMddHHmmss
	 */
	private Long endModifyTime;




	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public Long[] getIds() {
		return this.ids;
	}
	public void setIds(Long[] ids) {
		this.ids = ids;
	}


	public Long getStartId() {
		return this.startId;
	}
	public void setStartId(Long startId) {
		this.startId = startId;
	}


	public Long getEndId() {
		return this.endId;
	}
	public void setEndId(Long endId) {
		this.endId = endId;
	}


	public Long getOpId() {
		return this.opId;
	}
	public void setOpId(Long opId) {
		this.opId = opId;
	}


	public Long[] getOpIds() {
		return this.opIds;
	}
	public void setOpIds(Long[] opIds) {
		this.opIds = opIds;
	}


	public Long getStartOpId() {
		return this.startOpId;
	}
	public void setStartOpId(Long startOpId) {
		this.startOpId = startOpId;
	}


	public Long getEndOpId() {
		return this.endOpId;
	}
	public void setEndOpId(Long endOpId) {
		this.endOpId = endOpId;
	}


	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public Long[] getRoleIds() {
		return this.roleIds;
	}
	public void setRoleIds(Long[] roleIds) {
		this.roleIds = roleIds;
	}


	public Long getStartRoleId() {
		return this.startRoleId;
	}
	public void setStartRoleId(Long startRoleId) {
		this.startRoleId = startRoleId;
	}


	public Long getEndRoleId() {
		return this.endRoleId;
	}
	public void setEndRoleId(Long endRoleId) {
		this.endRoleId = endRoleId;
	}


	public Integer getIsMaster() {
		return this.isMaster;
	}
	public void setIsMaster(Integer isMaster) {
		this.isMaster = isMaster;
	}


	public Integer[] getIsMasters() {
		return this.isMasters;
	}
	public void setIsMasters(Integer[] isMasters) {
		this.isMasters = isMasters;
	}


	public Integer getStartIsMaster() {
		return this.startIsMaster;
	}
	public void setStartIsMaster(Integer startIsMaster) {
		this.startIsMaster = startIsMaster;
	}


	public Integer getEndIsMaster() {
		return this.endIsMaster;
	}
	public void setEndIsMaster(Integer endIsMaster) {
		this.endIsMaster = endIsMaster;
	}


	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}


	public Long[] getCreateTimes() {
		return this.createTimes;
	}
	public void setCreateTimes(Long[] createTimes) {
		this.createTimes = createTimes;
	}


	public Long getStartCreateTime() {
		return this.startCreateTime;
	}
	public void setStartCreateTime(Long startCreateTime) {
		this.startCreateTime = startCreateTime;
	}


	public Long getEndCreateTime() {
		return this.endCreateTime;
	}
	public void setEndCreateTime(Long endCreateTime) {
		this.endCreateTime = endCreateTime;
	}


	public Long getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}


	public Long[] getModifyTimes() {
		return this.modifyTimes;
	}
	public void setModifyTimes(Long[] modifyTimes) {
		this.modifyTimes = modifyTimes;
	}


	public Long getStartModifyTime() {
		return this.startModifyTime;
	}
	public void setStartModifyTime(Long startModifyTime) {
		this.startModifyTime = startModifyTime;
	}


	public Long getEndModifyTime() {
		return this.endModifyTime;
	}
	public void setEndModifyTime(Long endModifyTime) {
		this.endModifyTime = endModifyTime;
	}


}


