package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 角色表[SYS_ROLE]
 */
public class CSysRole implements Condition {
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
	 * condition-field: 角色代码[ROLE_CODE] operate-Like[like]
	 */
	private String roleCode;


	/**
	 * condition-field: 角色代码[ROLE_CODE] operate-Equal[=]
	 */
	private String roleCodeEqual;


	/**
	 * condition-field: 角色代码[ROLE_CODE] operate-In[in]
	 */
	private String[] roleCodes;


	/**
	 * condition-field: 角色名称[ROLE_NAME] operate-Like[like]
	 */
	private String roleName;


	/**
	 * condition-field: 角色名称[ROLE_NAME] operate-Equal[=]
	 */
	private String roleNameEqual;


	/**
	 * condition-field: 角色名称[ROLE_NAME] operate-In[in]
	 */
	private String[] roleNames;


	/**
	 * condition-field: 角色类型[ROLE_TYPE] operate-Equal[=]
	 * 1=全局角色 2=私有角色
	 */
	private Integer roleType;


	/**
	 * condition-field: 角色类型[ROLE_TYPE] operate-In[in]
	 * 1=全局角色 2=私有角色
	 */
	private Integer[] roleTypes;


	/**
	 * condition-field: 角色类型[ROLE_TYPE] operate-GTEqual[>=]
	 * 1=全局角色 2=私有角色
	 */
	private Integer startRoleType;

	/**
	 * condition-field: 角色类型[ROLE_TYPE] operate-LTEqual[<=]
	 * 1=全局角色 2=私有角色
	 */
	private Integer endRoleType;


	/**
	 * condition-field: 角色描述[ROLE_DESC] operate-Like[like]
	 */
	private String roleDesc;


	/**
	 * condition-field: 状态[STATUS] operate-Equal[=]
	 * 0=无效 1=有效
	 */
	private Integer status;


	/**
	 * condition-field: 状态[STATUS] operate-In[in]
	 * 0=无效 1=有效
	 */
	private Integer[] statuss;


	/**
	 * condition-field: 状态[STATUS] operate-GTEqual[>=]
	 * 0=无效 1=有效
	 */
	private Integer startStatus;

	/**
	 * condition-field: 状态[STATUS] operate-LTEqual[<=]
	 * 0=无效 1=有效
	 */
	private Integer endStatus;


	/**
	 * condition-field: 数据状态[DATA_STATUS] operate-Equal[=]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer dataStatus;


	/**
	 * condition-field: 数据状态[DATA_STATUS] operate-In[in]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer[] dataStatuss;


	/**
	 * condition-field: 数据状态[DATA_STATUS] operate-GTEqual[>=]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer startDataStatus;

	/**
	 * condition-field: 数据状态[DATA_STATUS] operate-LTEqual[<=]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer endDataStatus;


	/**
	 * condition-field: 创建人[CREATOR] operate-Like[like]
	 */
	private String creator;


	/**
	 * condition-field: 创建人[CREATOR] operate-Equal[=]
	 */
	private String creatorEqual;


	/**
	 * condition-field: 创建人[CREATOR] operate-In[in]
	 */
	private String[] creators;


	/**
	 * condition-field: 修改人[MODIFIER] operate-Like[like]
	 */
	private String modifier;


	/**
	 * condition-field: 修改人[MODIFIER] operate-Equal[=]
	 */
	private String modifierEqual;


	/**
	 * condition-field: 修改人[MODIFIER] operate-In[in]
	 */
	private String[] modifiers;


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


	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}


	public String getRoleCodeEqual() {
		return this.roleCodeEqual;
	}
	public void setRoleCodeEqual(String roleCodeEqual) {
		this.roleCodeEqual = roleCodeEqual;
	}


	public String[] getRoleCodes() {
		return this.roleCodes;
	}
	public void setRoleCodes(String[] roleCodes) {
		this.roleCodes = roleCodes;
	}


	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getRoleNameEqual() {
		return this.roleNameEqual;
	}
	public void setRoleNameEqual(String roleNameEqual) {
		this.roleNameEqual = roleNameEqual;
	}


	public String[] getRoleNames() {
		return this.roleNames;
	}
	public void setRoleNames(String[] roleNames) {
		this.roleNames = roleNames;
	}


	public Integer getRoleType() {
		return this.roleType;
	}
	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}


	public Integer[] getRoleTypes() {
		return this.roleTypes;
	}
	public void setRoleTypes(Integer[] roleTypes) {
		this.roleTypes = roleTypes;
	}


	public Integer getStartRoleType() {
		return this.startRoleType;
	}
	public void setStartRoleType(Integer startRoleType) {
		this.startRoleType = startRoleType;
	}


	public Integer getEndRoleType() {
		return this.endRoleType;
	}
	public void setEndRoleType(Integer endRoleType) {
		this.endRoleType = endRoleType;
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


	public Integer[] getStatuss() {
		return this.statuss;
	}
	public void setStatuss(Integer[] statuss) {
		this.statuss = statuss;
	}


	public Integer getStartStatus() {
		return this.startStatus;
	}
	public void setStartStatus(Integer startStatus) {
		this.startStatus = startStatus;
	}


	public Integer getEndStatus() {
		return this.endStatus;
	}
	public void setEndStatus(Integer endStatus) {
		this.endStatus = endStatus;
	}


	public Integer getDataStatus() {
		return this.dataStatus;
	}
	public void setDataStatus(Integer dataStatus) {
		this.dataStatus = dataStatus;
	}


	public Integer[] getDataStatuss() {
		return this.dataStatuss;
	}
	public void setDataStatuss(Integer[] dataStatuss) {
		this.dataStatuss = dataStatuss;
	}


	public Integer getStartDataStatus() {
		return this.startDataStatus;
	}
	public void setStartDataStatus(Integer startDataStatus) {
		this.startDataStatus = startDataStatus;
	}


	public Integer getEndDataStatus() {
		return this.endDataStatus;
	}
	public void setEndDataStatus(Integer endDataStatus) {
		this.endDataStatus = endDataStatus;
	}


	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}


	public String getCreatorEqual() {
		return this.creatorEqual;
	}
	public void setCreatorEqual(String creatorEqual) {
		this.creatorEqual = creatorEqual;
	}


	public String[] getCreators() {
		return this.creators;
	}
	public void setCreators(String[] creators) {
		this.creators = creators;
	}


	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}


	public String getModifierEqual() {
		return this.modifierEqual;
	}
	public void setModifierEqual(String modifierEqual) {
		this.modifierEqual = modifierEqual;
	}


	public String[] getModifiers() {
		return this.modifiers;
	}
	public void setModifiers(String[] modifiers) {
		this.modifiers = modifiers;
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


