package com.aic.paas.sys.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 系统菜单表[SYS_MENU]
 */
public class SysMenu implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 菜单代码[MENU_CODE]
	 */
	private String menuCode;


	/**
	 * mapping-field: 菜单名称[MENU_NAME]
	 */
	private String menuName;


	/**
	 * mapping-field: 上级菜单ID[PARENT_ID]
	 */
	private Long parentId;


	/**
	 * mapping-field: 对应模块ID[MODU_ID]
	 */
	private Long moduId;


	/**
	 * mapping-field: 菜单类型[MENU_TYPE]
	 * 1=内置功能 2=系统管理 3=业务管理 4=业务功能 对应系统代码：V_SYS_MODU_TYPE
	 */
	private Integer menuType;


	/**
	 * mapping-field: 菜单描述[MENU_DESC]
	 */
	private String menuDesc;


	/**
	 * mapping-field: 菜单图标[MENU_IMG]
	 */
	private String menuImg;


	/**
	 * mapping-field: 显示排序[ORDER_NO]
	 */
	private Integer orderNo;


	/**
	 * mapping-field: 是否末级[IS_LEAF]
	 * 1=是 0=否
	 */
	private Integer isLeaf;


	/**
	 * mapping-field: 是否目录[IS_DIR]
	 * 0=模块 1=目录
	 */
	private Integer isDir;


	/**
	 * mapping-field: 菜单层次级别[MENU_LEVEL]
	 * 级别：1-一级 2-二级 3-三级 4-四级 ...
	 */
	private Integer menuLevel;


	/**
	 * mapping-field: 菜单层次路径[MENU_LVL_PATH]
	 * 层级路径（从根节点ID到当前组织ID的上下级层级路径串，用#号分隔）
	 */
	private String menuLvlPath;


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


	public String getMenuCode() {
		return this.menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
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


	public Long getModuId() {
		return this.moduId;
	}
	public void setModuId(Long moduId) {
		this.moduId = moduId;
	}


	public Integer getMenuType() {
		return this.menuType;
	}
	public void setMenuType(Integer menuType) {
		this.menuType = menuType;
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


	public Integer getMenuLevel() {
		return this.menuLevel;
	}
	public void setMenuLevel(Integer menuLevel) {
		this.menuLevel = menuLevel;
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


