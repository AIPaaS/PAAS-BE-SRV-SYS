package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 系统模块表[SYS_MODU]
 */
public class CSysModu implements Condition {
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
	 * condition-field: 模块代码[MODU_CODE] operate-Like[like]
	 */
	private String moduCode;


	/**
	 * condition-field: 模块代码[MODU_CODE] operate-Equal[=]
	 */
	private String moduCodeEqual;


	/**
	 * condition-field: 模块代码[MODU_CODE] operate-In[in]
	 */
	private String[] moduCodes;


	/**
	 * condition-field: 模块名称[MODU_NAME] operate-Like[like]
	 */
	private String moduName;


	/**
	 * condition-field: 上级模块ID[PARENT_ID] operate-Equal[=]
	 * 第一级统一为0
	 */
	private Long parentId;


	/**
	 * condition-field: 上级模块ID[PARENT_ID] operate-In[in]
	 * 第一级统一为0
	 */
	private Long[] parentIds;


	/**
	 * condition-field: 上级模块ID[PARENT_ID] operate-GTEqual[>=]
	 * 第一级统一为0
	 */
	private Long startParentId;

	/**
	 * condition-field: 上级模块ID[PARENT_ID] operate-LTEqual[<=]
	 * 第一级统一为0
	 */
	private Long endParentId;


	/**
	 * condition-field: 是否末级[IS_LEAF] operate-Equal[=]
	 * 0=否 1=是
	 */
	private Integer isLeaf;


	/**
	 * condition-field: 是否末级[IS_LEAF] operate-In[in]
	 * 0=否 1=是
	 */
	private Integer[] isLeafs;


	/**
	 * condition-field: 是否末级[IS_LEAF] operate-GTEqual[>=]
	 * 0=否 1=是
	 */
	private Integer startIsLeaf;

	/**
	 * condition-field: 是否末级[IS_LEAF] operate-LTEqual[<=]
	 * 0=否 1=是
	 */
	private Integer endIsLeaf;


	/**
	 * condition-field: 是否目录[IS_DIR] operate-Equal[=]
	 * 0=模块 1=目录
	 */
	private Integer isDir;


	/**
	 * condition-field: 是否目录[IS_DIR] operate-In[in]
	 * 0=模块 1=目录
	 */
	private Integer[] isDirs;


	/**
	 * condition-field: 是否目录[IS_DIR] operate-GTEqual[>=]
	 * 0=模块 1=目录
	 */
	private Integer startIsDir;

	/**
	 * condition-field: 是否目录[IS_DIR] operate-LTEqual[<=]
	 * 0=模块 1=目录
	 */
	private Integer endIsDir;


	/**
	 * condition-field: 模块类型[MODU_TYPE] operate-Equal[=]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer moduType;


	/**
	 * condition-field: 模块类型[MODU_TYPE] operate-In[in]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer[] moduTypes;


	/**
	 * condition-field: 模块类型[MODU_TYPE] operate-GTEqual[>=]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer startModuType;

	/**
	 * condition-field: 模块类型[MODU_TYPE] operate-LTEqual[<=]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer endModuType;


	/**
	 * condition-field: 技术类型[TECHNIC_TYPE] operate-Equal[=]
	 * 1=EXT 2=HTML 3=VML 4=VML+EXT
	 */
	private Integer technicType;


	/**
	 * condition-field: 技术类型[TECHNIC_TYPE] operate-In[in]
	 * 1=EXT 2=HTML 3=VML 4=VML+EXT
	 */
	private Integer[] technicTypes;


	/**
	 * condition-field: 技术类型[TECHNIC_TYPE] operate-GTEqual[>=]
	 * 1=EXT 2=HTML 3=VML 4=VML+EXT
	 */
	private Integer startTechnicType;

	/**
	 * condition-field: 技术类型[TECHNIC_TYPE] operate-LTEqual[<=]
	 * 1=EXT 2=HTML 3=VML 4=VML+EXT
	 */
	private Integer endTechnicType;


	/**
	 * condition-field: 模块描述[MODU_DESC] operate-Like[like]
	 */
	private String moduDesc;


	/**
	 * condition-field: 显示排序[ORDER_NO] operate-Equal[=]
	 */
	private Integer orderNo;


	/**
	 * condition-field: 显示排序[ORDER_NO] operate-In[in]
	 */
	private Integer[] orderNos;


	/**
	 * condition-field: 显示排序[ORDER_NO] operate-GTEqual[>=]
	 */
	private Integer startOrderNo;

	/**
	 * condition-field: 显示排序[ORDER_NO] operate-LTEqual[<=]
	 */
	private Integer endOrderNo;


	/**
	 * condition-field: 链接地址[MODU_URL] operate-Like[like]
	 */
	private String moduUrl;


	/**
	 * condition-field: 模块参数[MODU_PARAM] operate-Like[like]
	 * a=1&b=2
	 */
	private String moduParam;


	/**
	 * condition-field: 帮助地址[HELP_URL] operate-Like[like]
	 */
	private String helpUrl;


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


	public String getModuCode() {
		return this.moduCode;
	}
	public void setModuCode(String moduCode) {
		this.moduCode = moduCode;
	}


	public String getModuCodeEqual() {
		return this.moduCodeEqual;
	}
	public void setModuCodeEqual(String moduCodeEqual) {
		this.moduCodeEqual = moduCodeEqual;
	}


	public String[] getModuCodes() {
		return this.moduCodes;
	}
	public void setModuCodes(String[] moduCodes) {
		this.moduCodes = moduCodes;
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


	public Long[] getParentIds() {
		return this.parentIds;
	}
	public void setParentIds(Long[] parentIds) {
		this.parentIds = parentIds;
	}


	public Long getStartParentId() {
		return this.startParentId;
	}
	public void setStartParentId(Long startParentId) {
		this.startParentId = startParentId;
	}


	public Long getEndParentId() {
		return this.endParentId;
	}
	public void setEndParentId(Long endParentId) {
		this.endParentId = endParentId;
	}


	public Integer getIsLeaf() {
		return this.isLeaf;
	}
	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}


	public Integer[] getIsLeafs() {
		return this.isLeafs;
	}
	public void setIsLeafs(Integer[] isLeafs) {
		this.isLeafs = isLeafs;
	}


	public Integer getStartIsLeaf() {
		return this.startIsLeaf;
	}
	public void setStartIsLeaf(Integer startIsLeaf) {
		this.startIsLeaf = startIsLeaf;
	}


	public Integer getEndIsLeaf() {
		return this.endIsLeaf;
	}
	public void setEndIsLeaf(Integer endIsLeaf) {
		this.endIsLeaf = endIsLeaf;
	}


	public Integer getIsDir() {
		return this.isDir;
	}
	public void setIsDir(Integer isDir) {
		this.isDir = isDir;
	}


	public Integer[] getIsDirs() {
		return this.isDirs;
	}
	public void setIsDirs(Integer[] isDirs) {
		this.isDirs = isDirs;
	}


	public Integer getStartIsDir() {
		return this.startIsDir;
	}
	public void setStartIsDir(Integer startIsDir) {
		this.startIsDir = startIsDir;
	}


	public Integer getEndIsDir() {
		return this.endIsDir;
	}
	public void setEndIsDir(Integer endIsDir) {
		this.endIsDir = endIsDir;
	}


	public Integer getModuType() {
		return this.moduType;
	}
	public void setModuType(Integer moduType) {
		this.moduType = moduType;
	}


	public Integer[] getModuTypes() {
		return this.moduTypes;
	}
	public void setModuTypes(Integer[] moduTypes) {
		this.moduTypes = moduTypes;
	}


	public Integer getStartModuType() {
		return this.startModuType;
	}
	public void setStartModuType(Integer startModuType) {
		this.startModuType = startModuType;
	}


	public Integer getEndModuType() {
		return this.endModuType;
	}
	public void setEndModuType(Integer endModuType) {
		this.endModuType = endModuType;
	}


	public Integer getTechnicType() {
		return this.technicType;
	}
	public void setTechnicType(Integer technicType) {
		this.technicType = technicType;
	}


	public Integer[] getTechnicTypes() {
		return this.technicTypes;
	}
	public void setTechnicTypes(Integer[] technicTypes) {
		this.technicTypes = technicTypes;
	}


	public Integer getStartTechnicType() {
		return this.startTechnicType;
	}
	public void setStartTechnicType(Integer startTechnicType) {
		this.startTechnicType = startTechnicType;
	}


	public Integer getEndTechnicType() {
		return this.endTechnicType;
	}
	public void setEndTechnicType(Integer endTechnicType) {
		this.endTechnicType = endTechnicType;
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


	public Integer[] getOrderNos() {
		return this.orderNos;
	}
	public void setOrderNos(Integer[] orderNos) {
		this.orderNos = orderNos;
	}


	public Integer getStartOrderNo() {
		return this.startOrderNo;
	}
	public void setStartOrderNo(Integer startOrderNo) {
		this.startOrderNo = startOrderNo;
	}


	public Integer getEndOrderNo() {
		return this.endOrderNo;
	}
	public void setEndOrderNo(Integer endOrderNo) {
		this.endOrderNo = endOrderNo;
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


