package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 模块资源表[SYS_MODU_RES]
 */
public class SysModuRes implements EntityBean {
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
	 * mapping-field: 资源序号[ORDER_NO]
	 */
	private Integer orderNo;


	/**
	 * mapping-field: 资源地址[RES_URL]
	 */
	private String resUrl;


	/**
	 * mapping-field: 资源类型[RES_TYPE]
	 * 1=JS 2=CSS
	 */
	private Integer resType;


	/**
	 * mapping-field: 资源描述[RES_DESC]
	 */
	private String resDesc;


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


	public Integer getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}


	public String getResUrl() {
		return this.resUrl;
	}
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}


	public Integer getResType() {
		return this.resType;
	}
	public void setResType(Integer resType) {
		this.resType = resType;
	}


	public String getResDesc() {
		return this.resDesc;
	}
	public void setResDesc(String resDesc) {
		this.resDesc = resDesc;
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


