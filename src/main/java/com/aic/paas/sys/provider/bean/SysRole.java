package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 角色表[SYS_ROLE]
 */
public class SysRole implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 角色代码[ROLE_CODE]
	 */
	private String roleCode;


	/**
	 * mapping-field: 角色名称[ROLE_NAME]
	 */
	private String roleName;


	/**
	 * mapping-field: 角色类型[ROLE_TYPE]
	 * 1=全局角色 2=私有角色
	 */
	private Integer roleType;


	/**
	 * mapping-field: 角色描述[ROLE_DESC]
	 */
	private String roleDesc;


	/**
	 * mapping-field: 状态[STATUS]
	 * 0=无效 1=有效
	 */
	private Integer status;


	/**
	 * mapping-field: 数据状态[DATA_STATUS]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer dataStatus;


	/**
	 * mapping-field: 创建人[CREATOR]
	 */
	private String creator;


	/**
	 * mapping-field: 修改人[MODIFIER]
	 */
	private String modifier;


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


	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}


	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public Integer getRoleType() {
		return this.roleType;
	}
	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}


	public String getRoleDesc() {
		return this.roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}


	public Integer getStatus() {
		return this.status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}


	public Integer getDataStatus() {
		return this.dataStatus;
	}
	public void setDataStatus(Integer dataStatus) {
		this.dataStatus = dataStatus;
	}


	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}


	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
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


