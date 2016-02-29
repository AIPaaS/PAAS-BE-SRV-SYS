package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 系统菜单表[SYS_MENU]
 */
public class CSysMenu implements Condition {
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
	 * condition-field: 菜单代码[MENU_CODE] operate-Like[like]
	 */
	private String menuCode;


	/**
	 * condition-field: 菜单代码[MENU_CODE] operate-Equal[=]
	 */
	private String menuCodeEqual;


	/**
	 * condition-field: 菜单代码[MENU_CODE] operate-In[in]
	 */
	private String[] menuCodes;


	/**
	 * condition-field: 菜单名称[MENU_NAME] operate-Like[like]
	 */
	private String menuName;


	/**
	 * condition-field: 上级菜单ID[PARENT_ID] operate-Equal[=]
	 */
	private Long parentId;


	/**
	 * condition-field: 上级菜单ID[PARENT_ID] operate-In[in]
	 */
	private Long[] parentIds;


	/**
	 * condition-field: 上级菜单ID[PARENT_ID] operate-GTEqual[>=]
	 */
	private Long startParentId;

	/**
	 * condition-field: 上级菜单ID[PARENT_ID] operate-LTEqual[<=]
	 */
	private Long endParentId;


	/**
	 * condition-field: 对应模块ID[MODU_ID] operate-Equal[=]
	 */
	private Long moduId;


	/**
	 * condition-field: 对应模块ID[MODU_ID] operate-In[in]
	 */
	private Long[] moduIds;


	/**
	 * condition-field: 对应模块ID[MODU_ID] operate-GTEqual[>=]
	 */
	private Long startModuId;

	/**
	 * condition-field: 对应模块ID[MODU_ID] operate-LTEqual[<=]
	 */
	private Long endModuId;


	/**
	 * condition-field: 菜单类型[MENU_TYPE] operate-Equal[=]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer menuType;


	/**
	 * condition-field: 菜单类型[MENU_TYPE] operate-In[in]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer[] menuTypes;


	/**
	 * condition-field: 菜单类型[MENU_TYPE] operate-GTEqual[>=]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer startMenuType;

	/**
	 * condition-field: 菜单类型[MENU_TYPE] operate-LTEqual[<=]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer endMenuType;


	/**
	 * condition-field: 菜单描述[MENU_DESC] operate-Like[like]
	 */
	private String menuDesc;


	/**
	 * condition-field: 菜单图标[MENU_IMG] operate-Like[like]
	 */
	private String menuImg;


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
	 * condition-field: 是否末级[IS_LEAF] operate-Equal[=]
	 * 1=是 0=否
	 */
	private Integer isLeaf;


	/**
	 * condition-field: 是否末级[IS_LEAF] operate-In[in]
	 * 1=是 0=否
	 */
	private Integer[] isLeafs;


	/**
	 * condition-field: 是否末级[IS_LEAF] operate-GTEqual[>=]
	 * 1=是 0=否
	 */
	private Integer startIsLeaf;

	/**
	 * condition-field: 是否末级[IS_LEAF] operate-LTEqual[<=]
	 * 1=是 0=否
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
	 * condition-field: 菜单层次级别[MENU_LEVEL] operate-Equal[=]
	 * 级别：1-一级 2-二级 3-三级 4-四级 ...
	 */
	private Integer menuLevel;


	/**
	 * condition-field: 菜单层次级别[MENU_LEVEL] operate-In[in]
	 * 级别：1-一级 2-二级 3-三级 4-四级 ...
	 */
	private Integer[] menuLevels;


	/**
	 * condition-field: 菜单层次级别[MENU_LEVEL] operate-GTEqual[>=]
	 * 级别：1-一级 2-二级 3-三级 4-四级 ...
	 */
	private Integer startMenuLevel;

	/**
	 * condition-field: 菜单层次级别[MENU_LEVEL] operate-LTEqual[<=]
	 * 级别：1-一级 2-二级 3-三级 4-四级 ...
	 */
	private Integer endMenuLevel;


	/**
	 * condition-field: 菜单层次路径[MENU_LVL_PATH] operate-Like[like]
	 * 层级路径（从根节点ID到当前组织ID的上下级层级路径串，用#号分隔）
	 */
	private String menuLvlPath;


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


	public String getMenuCode() {
		return this.menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}


	public String getMenuCodeEqual() {
		return this.menuCodeEqual;
	}
	public void setMenuCodeEqual(String menuCodeEqual) {
		this.menuCodeEqual = menuCodeEqual;
	}


	public String[] getMenuCodes() {
		return this.menuCodes;
	}
	public void setMenuCodes(String[] menuCodes) {
		this.menuCodes = menuCodes;
	}


	public String getMenuName() {
		return this.menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
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


	public Integer getMenuType() {
		return this.menuType;
	}
	public void setMenuType(Integer menuType) {
		this.menuType = menuType;
	}


	public Integer[] getMenuTypes() {
		return this.menuTypes;
	}
	public void setMenuTypes(Integer[] menuTypes) {
		this.menuTypes = menuTypes;
	}


	public Integer getStartMenuType() {
		return this.startMenuType;
	}
	public void setStartMenuType(Integer startMenuType) {
		this.startMenuType = startMenuType;
	}


	public Integer getEndMenuType() {
		return this.endMenuType;
	}
	public void setEndMenuType(Integer endMenuType) {
		this.endMenuType = endMenuType;
	}


	public String getMenuDesc() {
		return this.menuDesc;
	}
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}


	public String getMenuImg() {
		return this.menuImg;
	}
	public void setMenuImg(String menuImg) {
		this.menuImg = menuImg;
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


	public Integer getMenuLevel() {
		return this.menuLevel;
	}
	public void setMenuLevel(Integer menuLevel) {
		this.menuLevel = menuLevel;
	}


	public Integer[] getMenuLevels() {
		return this.menuLevels;
	}
	public void setMenuLevels(Integer[] menuLevels) {
		this.menuLevels = menuLevels;
	}


	public Integer getStartMenuLevel() {
		return this.startMenuLevel;
	}
	public void setStartMenuLevel(Integer startMenuLevel) {
		this.startMenuLevel = startMenuLevel;
	}


	public Integer getEndMenuLevel() {
		return this.endMenuLevel;
	}
	public void setEndMenuLevel(Integer endMenuLevel) {
		this.endMenuLevel = endMenuLevel;
	}


	public String getMenuLvlPath() {
		return this.menuLvlPath;
	}
	public void setMenuLvlPath(String menuLvlPath) {
		this.menuLvlPath = menuLvlPath;
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


