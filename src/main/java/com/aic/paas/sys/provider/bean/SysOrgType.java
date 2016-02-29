package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 组织类型表[SYS_ORG_TYPE]
 */
public class SysOrgType implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 组织类型代码[ORG_TYPE_CODE]
	 */
	private String orgTypeCode;


	/**
	 * mapping-field: 组织类型名称[ORG_TYPE_NAME]
	 */
	private String orgTypeName;


	/**
	 * mapping-field: 组织类型描述[ORG_TYPE_DESC]
	 */
	private String orgTypeDesc;


	/**
	 * mapping-field: 组织类型图标[ORG_TYPE_ICON]
	 * 组织类型图标（页面显示使用）
	 */
	private String orgTypeIcon;


	/**
	 * mapping-field: 组织类型颜色[ORG_TYPE_COLOR]
	 * 组织类型颜色（页面显示使用）
	 */
	private String orgTypeColor;


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


	public String getOrgTypeCode() {
		return this.orgTypeCode;
	}
	public void setOrgTypeCode(String orgTypeCode) {
		this.orgTypeCode = orgTypeCode;
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


