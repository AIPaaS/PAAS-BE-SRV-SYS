package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 组织类型表[SYS_ORG_TYPE]
 */
public class CSysOrgType implements Condition {
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
	 * condition-field: 组织类型代码[ORG_TYPE_CODE] operate-Like[like]
	 */
	private String orgTypeCode;


	/**
	 * condition-field: 组织类型代码[ORG_TYPE_CODE] operate-Equal[=]
	 */
	private String orgTypeCodeEqual;


	/**
	 * condition-field: 组织类型代码[ORG_TYPE_CODE] operate-In[in]
	 */
	private String[] orgTypeCodes;


	/**
	 * condition-field: 组织类型名称[ORG_TYPE_NAME] operate-Like[like]
	 */
	private String orgTypeName;


	/**
	 * condition-field: 组织类型描述[ORG_TYPE_DESC] operate-Like[like]
	 */
	private String orgTypeDesc;


	/**
	 * condition-field: 组织类型图标[ORG_TYPE_ICON] operate-Like[like]
	 * 组织类型图标（页面显示使用）
	 */
	private String orgTypeIcon;


	/**
	 * condition-field: 组织类型颜色[ORG_TYPE_COLOR] operate-Like[like]
	 * 组织类型颜色（页面显示使用）
	 */
	private String orgTypeColor;


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


	public String getOrgTypeCode() {
		return this.orgTypeCode;
	}
	public void setOrgTypeCode(String orgTypeCode) {
		this.orgTypeCode = orgTypeCode;
	}


	public String getOrgTypeCodeEqual() {
		return this.orgTypeCodeEqual;
	}
	public void setOrgTypeCodeEqual(String orgTypeCodeEqual) {
		this.orgTypeCodeEqual = orgTypeCodeEqual;
	}


	public String[] getOrgTypeCodes() {
		return this.orgTypeCodes;
	}
	public void setOrgTypeCodes(String[] orgTypeCodes) {
		this.orgTypeCodes = orgTypeCodes;
	}


	public String getOrgTypeName() {
		return this.orgTypeName;
	}
	public void setOrgTypeName(String orgTypeName) {
		this.orgTypeName = orgTypeName;
	}


	public String getOrgTypeDesc() {
		return this.orgTypeDesc;
	}
	public void setOrgTypeDesc(String orgTypeDesc) {
		this.orgTypeDesc = orgTypeDesc;
	}


	public String getOrgTypeIcon() {
		return this.orgTypeIcon;
	}
	public void setOrgTypeIcon(String orgTypeIcon) {
		this.orgTypeIcon = orgTypeIcon;
	}


	public String getOrgTypeColor() {
		return this.orgTypeColor;
	}
	public void setOrgTypeColor(String orgTypeColor) {
		this.orgTypeColor = orgTypeColor;
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


