package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 模块代码表[SYS_MODU_DROP]
 */
public class SysModuDrop implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 模块ID[MODU_ID]
	 */
	private Long moduId;


	/**
	 * mapping-field: 定义代码[DEF_CODE]
	 */
	private String defCode;


	/**
	 * mapping-field: 是否携带属性[ADD_ATTRS]
	 * 1=是 0=否
	 */
	private Integer addAttrs;


	/**
	 * mapping-field: 是否添加空行[ADD_EMPTY]
	 * 1=是 0=否
	 */
	private Integer addEmpty;


	/**
	 * mapping-field: 描述[REMARK]
	 */
	private String remark;


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


	public Long getModuId() {
		return this.moduId;
	}
	public void setModuId(Long moduId) {
		this.moduId = moduId;
	}


	public String getDefCode() {
		return this.defCode;
	}
	public void setDefCode(String defCode) {
		this.defCode = defCode;
	}


	public Integer getAddAttrs() {
		return this.addAttrs;
	}
	public void setAddAttrs(Integer addAttrs) {
		this.addAttrs = addAttrs;
	}


	public Integer getAddEmpty() {
		return this.addEmpty;
	}
	public void setAddEmpty(Integer addEmpty) {
		this.addEmpty = addEmpty;
	}


	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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


