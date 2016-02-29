package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 模块代码表[SYS_MODU_DROP]
 */
public class CSysModuDrop implements Condition {
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
	 * condition-field: 模块ID[MODU_ID] operate-Equal[=]
	 */
	private Long moduId;


	/**
	 * condition-field: 模块ID[MODU_ID] operate-In[in]
	 */
	private Long[] moduIds;


	/**
	 * condition-field: 模块ID[MODU_ID] operate-GTEqual[>=]
	 */
	private Long startModuId;

	/**
	 * condition-field: 模块ID[MODU_ID] operate-LTEqual[<=]
	 */
	private Long endModuId;


	/**
	 * condition-field: 定义代码[DEF_CODE] operate-Like[like]
	 */
	private String defCode;


	/**
	 * condition-field: 定义代码[DEF_CODE] operate-Equal[=]
	 */
	private String defCodeEqual;


	/**
	 * condition-field: 定义代码[DEF_CODE] operate-In[in]
	 */
	private String[] defCodes;


	/**
	 * condition-field: 是否携带属性[ADD_ATTRS] operate-Equal[=]
	 * 1=是 0=否
	 */
	private Integer addAttrs;


	/**
	 * condition-field: 是否携带属性[ADD_ATTRS] operate-In[in]
	 * 1=是 0=否
	 */
	private Integer[] addAttrss;


	/**
	 * condition-field: 是否携带属性[ADD_ATTRS] operate-GTEqual[>=]
	 * 1=是 0=否
	 */
	private Integer startAddAttrs;

	/**
	 * condition-field: 是否携带属性[ADD_ATTRS] operate-LTEqual[<=]
	 * 1=是 0=否
	 */
	private Integer endAddAttrs;


	/**
	 * condition-field: 是否添加空行[ADD_EMPTY] operate-Equal[=]
	 * 1=是 0=否
	 */
	private Integer addEmpty;


	/**
	 * condition-field: 是否添加空行[ADD_EMPTY] operate-In[in]
	 * 1=是 0=否
	 */
	private Integer[] addEmptys;


	/**
	 * condition-field: 是否添加空行[ADD_EMPTY] operate-GTEqual[>=]
	 * 1=是 0=否
	 */
	private Integer startAddEmpty;

	/**
	 * condition-field: 是否添加空行[ADD_EMPTY] operate-LTEqual[<=]
	 * 1=是 0=否
	 */
	private Integer endAddEmpty;


	/**
	 * condition-field: 描述[REMARK] operate-Like[like]
	 */
	private String remark;


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


	public Long getModuId() {
		return this.moduId;
	}
	public void setModuId(Long moduId) {
		this.moduId = moduId;
	}


	public Long[] getModuIds() {
		return this.moduIds;
	}
	public void setModuIds(Long[] moduIds) {
		this.moduIds = moduIds;
	}


	public Long getStartModuId() {
		return this.startModuId;
	}
	public void setStartModuId(Long startModuId) {
		this.startModuId = startModuId;
	}


	public Long getEndModuId() {
		return this.endModuId;
	}
	public void setEndModuId(Long endModuId) {
		this.endModuId = endModuId;
	}


	public String getDefCode() {
		return this.defCode;
	}
	public void setDefCode(String defCode) {
		this.defCode = defCode;
	}


	public String getDefCodeEqual() {
		return this.defCodeEqual;
	}
	public void setDefCodeEqual(String defCodeEqual) {
		this.defCodeEqual = defCodeEqual;
	}


	public String[] getDefCodes() {
		return this.defCodes;
	}
	public void setDefCodes(String[] defCodes) {
		this.defCodes = defCodes;
	}


	public Integer getAddAttrs() {
		return this.addAttrs;
	}
	public void setAddAttrs(Integer addAttrs) {
		this.addAttrs = addAttrs;
	}


	public Integer[] getAddAttrss() {
		return this.addAttrss;
	}
	public void setAddAttrss(Integer[] addAttrss) {
		this.addAttrss = addAttrss;
	}


	public Integer getStartAddAttrs() {
		return this.startAddAttrs;
	}
	public void setStartAddAttrs(Integer startAddAttrs) {
		this.startAddAttrs = startAddAttrs;
	}


	public Integer getEndAddAttrs() {
		return this.endAddAttrs;
	}
	public void setEndAddAttrs(Integer endAddAttrs) {
		this.endAddAttrs = endAddAttrs;
	}


	public Integer getAddEmpty() {
		return this.addEmpty;
	}
	public void setAddEmpty(Integer addEmpty) {
		this.addEmpty = addEmpty;
	}


	public Integer[] getAddEmptys() {
		return this.addEmptys;
	}
	public void setAddEmptys(Integer[] addEmptys) {
		this.addEmptys = addEmptys;
	}


	public Integer getStartAddEmpty() {
		return this.startAddEmpty;
	}
	public void setStartAddEmpty(Integer startAddEmpty) {
		this.startAddEmpty = startAddEmpty;
	}


	public Integer getEndAddEmpty() {
		return this.endAddEmpty;
	}
	public void setEndAddEmpty(Integer endAddEmpty) {
		this.endAddEmpty = endAddEmpty;
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


