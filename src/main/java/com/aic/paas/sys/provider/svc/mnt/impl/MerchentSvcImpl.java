package com.aic.paas.sys.provider.svc.mnt.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.comm.util.SystemUtil;
import com.aic.paas.sys.provider.bean.CSysOp;
import com.aic.paas.sys.provider.bean.CSysOpOrg;
import com.aic.paas.sys.provider.bean.CSysOpRole;
import com.aic.paas.sys.provider.bean.CSysRole;
import com.aic.paas.sys.provider.bean.CWsMerchent;
import com.aic.paas.sys.provider.bean.SysMenu;
import com.aic.paas.sys.provider.bean.SysOp;
import com.aic.paas.sys.provider.bean.SysOpOrg;
import com.aic.paas.sys.provider.bean.SysOpRole;
import com.aic.paas.sys.provider.bean.SysOrg;
import com.aic.paas.sys.provider.bean.SysRole;
import com.aic.paas.sys.provider.bean.WsMerchent;
import com.aic.paas.sys.provider.db.SysMenuDao;
import com.aic.paas.sys.provider.db.SysModuDao;
import com.aic.paas.sys.provider.db.SysModuRoleDao;
import com.aic.paas.sys.provider.db.SysOpDao;
import com.aic.paas.sys.provider.db.SysOpOrgDao;
import com.aic.paas.sys.provider.db.SysOpRoleDao;
import com.aic.paas.sys.provider.db.SysOrgDao;
import com.aic.paas.sys.provider.db.SysRoleDao;
import com.aic.paas.sys.provider.db.WsMerchentDao;
import com.aic.paas.sys.provider.svc.bean.MenuNode;
import com.aic.paas.sys.provider.svc.bean.RoleAuth;
import com.aic.paas.sys.provider.svc.bean.SysOpInfo;
import com.aic.paas.sys.provider.svc.mnt.MerchentSvc;
import com.binary.core.encrypt.EncryptAES;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.bean.User;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;

public class MerchentSvcImpl implements MerchentSvc {

	
	@Autowired
	WsMerchentDao merchentDao;
	
		
	@Autowired
	SysOrgDao orgDao;
	
	@Autowired
	SysOpDao opDao;
		
	@Autowired
	SysOpOrgDao opOrgDao;
	
	@Autowired
	SysOpRoleDao opRoleDao;
	
	@Autowired
	SysRoleDao roleDao;
	
	@Autowired
	SysModuRoleDao moduRoleDao;
	
	@Autowired
	SysModuDao moduDao;
	
	@Autowired
	SysMenuDao menuDao;
	
	
	
	
	/** 租户默认管理员角色ID **/
	private Long mntDefaultRoleId;
	
	
	
	
	public Long getMntDefaultRoleId() {
		return mntDefaultRoleId;
	}
	public void setMntDefaultRoleId(Long mntDefaultRoleId) {
		this.mntDefaultRoleId = mntDefaultRoleId;
	}



	@Override
	public Page<WsMerchent> queryPage(Integer pageNum, Integer pageSize, CWsMerchent cdt, String orders) {
		return merchentDao.selectPage(pageNum, pageSize, cdt, orders);
	}
	

	
	@Override
	public List<WsMerchent> queryList(CWsMerchent cdt, String orders) {
		return merchentDao.selectList(cdt, orders);
	}

	
	
	@Override
	public WsMerchent queryById(Long id) {
		return merchentDao.selectById(id);
	}
	
	
	
	@Override
	public Long queryCount(CWsMerchent cdt) {
		return merchentDao.selectCount(cdt);
	}

	
	
	private String encryptPwd(String password) {
		return EncryptAES.encrypt(password);
	}

	
	@Override
	public Long saveOrUpdate(WsMerchent record) {
		BinaryUtils.checkEmpty(record, "record");
		
		boolean isadd = record.getId() == null;
		if(isadd) {
			BinaryUtils.checkEmpty(record.getMntCode(), "record.mntCode");
			BinaryUtils.checkEmpty(record.getMntPwd(), "record.mntPwd");
			BinaryUtils.checkEmpty(record.getCcCode(), "record.ccCode");
			BinaryUtils.checkEmpty(record.getContactName(), "record.contactName");
			BinaryUtils.checkEmpty(record.getContactPhone(), "record.contactPhone");
			BinaryUtils.checkEmpty(record.getContactEmail(), "record.contactEmail");
			record.setStatus(0);
		}else {
			if(record.getMntCode() != null) BinaryUtils.checkEmpty(record.getMntCode(), "record.mntCode");
			if(record.getCcCode() != null) BinaryUtils.checkEmpty(record.getCcCode(), "record.ccCode");
			if(record.getContactName() != null) BinaryUtils.checkEmpty(record.getContactName(), "record.contactName");
			if(record.getContactPhone() != null) BinaryUtils.checkEmpty(record.getContactPhone(), "record.contactPhone");
			if(record.getContactEmail() != null) BinaryUtils.checkEmpty(record.getContactEmail(), "record.contactEmail");
			record.setMntPwd(null);
		}
		
		Long id = record.getId();
		String mntPwd = record.getMntPwd();
		record.setMntPwd(mntPwd);
		
		if(record.getMntCode() != null) {
			String code = record.getMntCode().trim();
			record.setMntCode(code);
			
			CWsMerchent cdt = new CWsMerchent();
			cdt.setMntCodeEqual(code);
			List<WsMerchent> ls = merchentDao.selectList(cdt, null);
			if(ls.size()>0 && (id==null || ls.size()>1 || ls.get(0).getId().longValue()!=id.longValue())) {
				throw new ServiceException(" is exists mntCode '"+code+"'! ");
			}
		}
		
		//对应组织信息
		SysOrg org = new SysOrg();
		org.setOrgCode(record.getMntCode());
		org.setOrgName(record.getMntName());
		org.setEmail(record.getContactEmail());
		org.setPhone(record.getContactPhone());
		org.setContactName(record.getContactName());
		org.setContactMobile(record.getContactPhone2());
		
		
		//如果是新建租户
		if(isadd) {
			//添加租户对应组织
			org.setOrgTypeId(2l);	//1=平台组织    2=租户组织
			org.setParentOrgId(0l);
			org.setOrgLevel(1);
			org.setStatus(0);
			id = orgDao.insert(org);
			
			//更新组织层级路径及权限组织ID
			SysOrg uporg = new SysOrg();
			uporg.setOrgLvlPath("#"+id+"#");
			uporg.setAuthOrgId(id);
			orgDao.updateById(uporg, id);
			
			//添加租户管理员
			SysOp op = new SysOp();
			op.setOpCode("admin");
			op.setOpName("租户管理员");
			op.setLoginCode("admin");
			op.setLoginPasswd(encryptPwd(mntPwd));
			op.setEmailAdress(record.getContactEmail());
			op.setLockFlag(0);
			op.setStatus(1);
			op.setMobileNo(record.getContactPhone());
			op.setOpKind(2); 		//1=平台用户    2=租户用户
			op.setSuperUserFlag(1); 	//超级用户	0-否 1-是
			op.setOpLevel(1);
			op.setSupOpId(0l);
			op.setCustom1(mntPwd);		//记录用户登录密码（明码）
			Long opId = opDao.insert(op);
			
			//设置用户与组织关系
			SysOpOrg oporg = new SysOpOrg();
			oporg.setOrgId(id);
			oporg.setOpId(opId);
			oporg.setDirectFlag(1);
			oporg.setAdminFlag(1);
			oporg.setStatus(1);
			opOrgDao.insert(oporg);
			
			//设置用户角色
			SysOpRole oprole = new SysOpRole();
			oprole.setOpId(opId);
			oprole.setRoleId(this.mntDefaultRoleId);
			oprole.setIsMaster(1);
			opRoleDao.insert(oprole);
		}else {
			//更新对应组织信息
			orgDao.updateById(org, id);
		}
		
		record.setId(id);
		merchentDao.insert(record);
		
		return id; 
	}

	
	
	@Override
	public void checkMnt(Long id, Integer checkType, String checkDesc) {
		BinaryUtils.checkEmpty(id, "id");
		BinaryUtils.checkEmpty(checkType, "checkType");		//1=通过    2=退回
		if(checkType.intValue() != 1) BinaryUtils.checkEmpty(checkDesc, "checkDesc");
		
		User user = SystemUtil.getLoginUser();
		WsMerchent up = new WsMerchent();
		up.setStatus(checkType.intValue()==1 ? 1 : 2);
		up.setCheckerId(user.getId());
		up.setCheckerName(user.getUserName());
		up.setCheckTime(BinaryUtils.getNumberDateTime());
		up.setCheckDesc(checkDesc);
		int count = merchentDao.updateById(up, id);
		
		//如果审核通过
		if(checkType.intValue()==1 && count>0) {
			//更新组织状态
			SysOrg org = new SysOrg();
			org.setStatus(1);
			orgDao.updateById(org, id);
		}
	}
	
	
	
	@Override
	public int removeById(Long id) {
		return merchentDao.deleteById(id);
	}
	
	
	
	@Override
	public Long saveOrUpdateUser(Long mntId, SysOp record) {
		BinaryUtils.checkEmpty(mntId, "mntId");
		BinaryUtils.checkEmpty(record, "record");
		
		boolean isadd = record.getId() == null;
		if(isadd) {
			BinaryUtils.checkEmpty(record.getOpCode(), "record.opCode");
			BinaryUtils.checkEmpty(record.getOpName(), "record.opName");
			BinaryUtils.checkEmpty(record.getLoginPasswd(), "record.loginPasswd");
			BinaryUtils.checkEmpty(record.getEmailAdress(), "record.emailAdress");
			BinaryUtils.checkEmpty(record.getStatus(), "record.status");
			
			record.setLoginCode(record.getOpCode());
			record.setLockFlag(0);
			record.setOpKind(2);
			record.setSuperUserFlag(0); 	//超级用户	0-否 1-是
		}else {
			if(record.getOpCode() != null) BinaryUtils.checkEmpty(record.getOpCode(), "record.opCode");
			if(record.getOpName() != null) BinaryUtils.checkEmpty(record.getOpName(), "record.opName");
			if(record.getLoginPasswd() != null) BinaryUtils.checkEmpty(record.getLoginPasswd(), "record.loginPasswd");
			if(record.getEmailAdress() != null) BinaryUtils.checkEmpty(record.getEmailAdress(), "record.emailAdress");
			if(record.getStatus() != null) BinaryUtils.checkEmpty(record.getStatus(), "record.status");
		}
		
		String passwd = record.getLoginPasswd();
		if(!BinaryUtils.isEmpty(passwd)) {
			record.setLoginPasswd(EncryptAES.encrypt(passwd));
			record.setCustom1(passwd);
		}
		
		Long opId = opDao.save(record);
		
		//如果是新增用户, 则保存用户对应组织关系
		if(isadd) {
			SysOpOrg opOrg = new SysOpOrg();
			opOrg.setOpId(opId);
			opOrg.setOrgId(mntId);
			opOrg.setDirectFlag(1);
			opOrg.setAdminFlag(0);
			opOrg.setStatus(1);
			opOrgDao.save(opOrg);
		}
		
		return opId;
	}
	
	
	
	
	@Override
	public int removeUser(Long opId) {
		BinaryUtils.checkEmpty(opId, "opId");
		
		//删除用户对应组织
		CSysOpOrg oporgcdt = new CSysOpOrg();
		oporgcdt.setOpId(opId);
		opOrgDao.deleteByCdt(oporgcdt);
		
		//删除用户对应角色
		CSysOpRole oprolecdt = new CSysOpRole();
		oprolecdt.setOpId(opId);
		opRoleDao.deleteByCdt(oprolecdt);
		
		//删除用户
		return opDao.deleteById(opId);
	}
	
	
	
	@Override
	public List<SysRole> queryOpRoles(Long opId) {
		BinaryUtils.checkEmpty(opId, "opId");
		CSysOpRole cdt = new CSysOpRole();
		cdt.setOpId(opId);
		List<SysOpRole> opRoles = opRoleDao.selectList(cdt, null);
		
		Long[] roleIds = new Long[opRoles.size()];
		for(int i=0; i<roleIds.length; i++) {
			roleIds[i] = opRoles.get(i).getId();
		}
		
		CSysRole rolecdt = new CSysRole();
		rolecdt.setIds(roleIds);
		return roleDao.selectList(rolecdt, " ROLE_CODE ");
	}
	
	
	
	private List<SysOpInfo> fillOpInfo(List<SysOp> ls) {
		List<SysOpInfo> infos = new ArrayList<SysOpInfo>();
		if(ls!=null && ls.size()>0) {
			Map<Long, SysOpInfo> infomap = new HashMap<Long, SysOpInfo>();
			Long[] opIds = new Long[ls.size()];
			
			for(int i=0; i<ls.size(); i++) {
				SysOp op = ls.get(i);
				SysOpInfo info = new SysOpInfo();
				info.setOp(op);
				infos.add(info);
				
				opIds[i] = op.getId();
				infomap.put(opIds[i], info);
			}
			
			
			CSysOpRole cdt = new CSysOpRole();
			cdt.setOpIds(opIds);
			List<SysOpRole> opRoles = opRoleDao.selectList(cdt, null);
			
			//key=opId, value=roleIds
			Map<Long, List<Long>> map = new HashMap<Long, List<Long>>();
			
			for(int i=0; i<opRoles.size(); i++) {
				SysOpRole or = opRoles.get(i);
				Long opId = or.getOpId();
				Long roleId = or.getRoleId();
				
				List<Long> os = map.get(opId);
				if(os == null) {
					os = new ArrayList<Long>();
					map.put(opId, os);
				}
				os.add(roleId);
			}
			
			Iterator<Entry<Long, List<Long>>> itor = map.entrySet().iterator();
			while(itor.hasNext()) {
				Entry<Long, List<Long>> e = itor.next();
				Long opId = e.getKey();
				List<Long> rIds = e.getValue();
				
				SysOpInfo info = infomap.get(opId);
				info.setRoleIds(rIds.toArray(new Long[0]));
			}
		}
		return infos;
	}
	
	
	
	
	@Override
	public Page<SysOpInfo> queryOpInfoPage(Integer pageNum, Integer pageSize, CSysOp cdt, String orders) {
		Page<SysOp> page = opDao.selectPage(pageNum, pageSize, cdt, orders);
		List<SysOp> ls = page.getData();
		List<SysOpInfo> infols = fillOpInfo(ls);
		return new Page<SysOpInfo>(page.getPageNum(), page.getPageSize(), page.getTotalRows(), page.getTotalPages(), infols);
	}


	
	@Override
	public List<SysOpInfo> queryOpInfoList(CSysOp cdt, String orders) {
		List<SysOp> ls = opDao.selectList(cdt, orders);
		return fillOpInfo(ls);
	}
	
	@Override
	public Page<SysOpInfo> queryOpInfoPageByOrg(Integer pageNum, Integer pageSize, Long orgId,Boolean direct,Boolean admin ,CSysOp cdt, String orders) {
		Page<SysOp> page = opDao.selectPageByOrg(pageNum, pageSize, orgId, direct, admin, cdt, orders);
		List<SysOp> ls = page.getData();
		List<SysOpInfo> infols = fillOpInfo(ls);
		return new Page<SysOpInfo>(page.getPageNum(), page.getPageSize(), page.getTotalRows(), page.getTotalPages(), infols);
	}
	
	@Override
	public List<SysOpInfo> queryOpInfoListByOrg(Long orgId,Boolean direct,Boolean admin ,CSysOp cdt, String orders) {
		List<SysOp> ls = opDao.selectListByOrg(orgId, direct, admin, cdt, orders);
		return fillOpInfo(ls);
	}

	
	
	
	@Override
	public SysOpInfo queryOpInfoById(Long opId) {
		SysOp p = opDao.selectById(opId);
		if(p != null) {
			List<SysOp> ls = new ArrayList<SysOp>();
			ls.add(p);
			return fillOpInfo(ls).get(0);
		}
		return null;
	}
	
	
	
	
	@Override
	public void setUserRoles(Long opId, Long[] roleIds) {
		BinaryUtils.checkEmpty(opId, "opId");
//		BinaryUtils.checkEmpty(roleIds, "roleIds");
		
		//删除用户对应角色
		CSysOpRole oprolecdt = new CSysOpRole();
		oprolecdt.setOpId(opId);
		opRoleDao.deleteByCdt(oprolecdt);
		
		if(roleIds!=null && roleIds.length>0) {
			List<SysOpRole> records = new ArrayList<SysOpRole>();
			for(int i=0; i<roleIds.length; i++) {
				SysOpRole r = new SysOpRole();
				r.setOpId(opId);
				r.setRoleId(roleIds[i]);
				r.setIsMaster(0);
				records.add(r);
			}
			
			opRoleDao.insertBatch(records);
		}
	}
	
	
	
	
	
	@Override
	public List<RoleAuth> queryRoleAuthView(CSysRole cdt, String orders) {
		if(cdt == null) cdt = new CSysRole();
		cdt.setStatus(1);
		if(BinaryUtils.isEmpty(orders)) orders = "ROLE_CODE";
		
		List<SysRole> ls = roleDao.selectList(cdt, orders);
		List<RoleAuth> authls = new ArrayList<RoleAuth>();
				
		if(ls.size() > 0) {
			Long[] roleIds = new Long[ls.size()];
			
			for(int i=0; i<ls.size(); i++) {
				SysRole role = ls.get(i);
				RoleAuth auth = new RoleAuth();
				auth.setRole(role);
				authls.add(auth);
				
				roleIds[i] = role.getId();
			}
			
			List<SysMenu> menus = merchentDao.selectRoleMenus(roleIds);
			Map<Long, List<SysMenu>> map = BinaryUtils.toObjectGroupMap(menus, "createTime");
			
			for(int i=0; i<authls.size(); i++) {
				RoleAuth auth = authls.get(i);
				Long roleId = auth.getRole().getId();
				List<SysMenu> ms = map.get(roleId);
				
				if(ms != null) {
					List<MenuNode> roots = toMenuNode(ms);
					auth.setRoots(roots);
				}
			}
		}
		
		return authls;
	}
	
	
	
	
	private List<MenuNode> toMenuNode(List<SysMenu> menus) {
		List<MenuNode> roots = new ArrayList<MenuNode>();
		List<MenuNode> alls = new ArrayList<MenuNode>();
		Map<Long, List<MenuNode>> parents = new HashMap<Long, List<MenuNode>>();
		
		for(int i=0; i<menus.size(); i++) {
			SysMenu m = menus.get(i);
			Long parentId = m.getParentId();
			
			MenuNode node = new MenuNode();
			node.setMenu(m);
			alls.add(node);
			
			if(parentId.longValue() == 0) {
				roots.add(node);
			}
			
			List<MenuNode> ls = parents.get(parentId);
			if(ls == null) {
				ls = new ArrayList<MenuNode>();
				parents.put(parentId, ls);
			}
			ls.add(node);
		}
		
		for(int i=0; i<alls.size(); i++) {
			MenuNode node = alls.get(i);
			Long id = node.getMenu().getId();
			node.setChildren(parents.get(id));
		}
		
		return roots;
	}

	
	
	
	

}
