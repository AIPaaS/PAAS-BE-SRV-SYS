package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 系统模块表[SYS_MODU]
 */
public class SysModu implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 模块代码[MODU_CODE]
	 */
	private String moduCode;


	/**
	 * mapping-field: 模块名称[MODU_NAME]
	 */
	private String moduName;


	/**
	 * mapping-field: 上级模块ID[PARENT_ID]
	 * 第一级统一为0
	 */
	private Long parentId;


	/**
	 * mapping-field: 是否末级[IS_LEAF]
	 * 0=否 1=是
	 */
	private Integer isLeaf;


	/**
	 * mapping-field: 是否目录[IS_DIR]
	 * 0=模块 1=目录
	 */
	private Integer isDir;


	/**
	 * mapping-field: 模块类型[MODU_TYPE]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer moduType;


	/**
	 * mapping-field: 技术类型[TECHNIC_TYPE]
	 * 1=EXT 2=HTML 3=VML 4=VML+EXT
	 */
	private Integer technicType;


	/**
	 * mapping-field: 模块描述[MODU_DESC]
	 */
	private String moduDesc;


	/**
	 * mapping-field: 显示排序[ORDER_NO]
	 */
	private Integer orderNo;


	/**
	 * mapping-field: 链接地址[MODU_URL]
	 */
	private String moduUrl;


	/**
	 * mapping-field: 模块参数[MODU_PARAM]
	 * a=1&b=2
	 */
	private String moduParam;


	/**
	 * mapping-field: 帮助地址[HELP_URL]
	 */
	private String helpUrl;


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


	public String getModuCode() {
		return this.moduCode;
	}
	public void setModuCode(String moduCode) {
		this.moduCode = moduCode;
	}


	public String getModuName() {
		return this.moduName;
	}
	public void setModuName(String moduName) {
		this.moduName = moduName;
	}


	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}


	public Integer getIsLeaf() {
		return this.isLeaf;
	}
	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}


	public Integer getIsDir() {
		return this.isDir;
	}
	public void setIsDir(Integer isDir) {
		this.isDir = isDir;
	}


	public Integer getModuType() {
		return this.moduType;
	}
	public void setModuType(Integer moduType) {
		this.moduType = moduType;
	}


	public Integer getTechnicType() {
		return this.technicType;
	}
	public void setTechnicType(Integer technicType) {
		this.technicType = technicType;
	}


	public String getModuDesc() {
		return this.moduDesc;
	}
	public void setModuDesc(String moduDesc) {
		this.moduDesc = moduDesc;
	}


	public Integer getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}


	public String getModuUrl() {
		return this.moduUrl;
	}
	public void setModuUrl(String moduUrl) {
		this.moduUrl = moduUrl;
	}


	public String getModuParam() {
		return this.moduParam;
	}
	public void setModuParam(String moduParam) {
		this.moduParam = moduParam;
	}


	public String getHelpUrl() {
		return this.helpUrl;
	}
	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
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


