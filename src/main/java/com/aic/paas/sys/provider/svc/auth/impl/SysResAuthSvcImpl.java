package com.aic.paas.sys.provider.svc.auth.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.aic.paas.sys.provider.bean.CSysMenu;
import com.aic.paas.sys.provider.bean.CSysModu;
import com.aic.paas.sys.provider.bean.CSysModuRole;
import com.aic.paas.sys.provider.bean.SysMenu;
import com.aic.paas.sys.provider.bean.SysModu;
import com.aic.paas.sys.provider.bean.SysModuRole;
import com.aic.paas.sys.provider.svc.auth.SysResAuthSvc;



public class SysResAuthSvcImpl extends AbstractSysAuth implements SysResAuthSvc {
	
	
	
	
	
	/**
	 * 获取用户权限范围内的模块ID
	 * @return 可能返回Long[0]||null
	 */
	protected Set<Long> getOpAuthModuIds(Long opId, CSysModu cdt) {
		Long[] roleIds = getOpRoleIds(opId);
		if(roleIds==null || roleIds.length==0) return null;
		
		CSysModuRole modurolecdt = new CSysModuRole();
		modurolecdt.setRoleIds(roleIds);
		List<SysModuRole> mrs = moduRoleDao.selectList(modurolecdt, null);
		if(mrs.size() == 0) return null;
		
		Set<Long> moduIdSet = new HashSet<Long>();
		for(int i=0; i<mrs.size(); i++) {
			SysModuRole mr = mrs.get(i);
			moduIdSet.add(mr.getModuId());
		}
		
		//如果当前参数条件中指定了ModuIds, 则取权限与参数的交集
		Long[] ids = cdt.getIds();
		if(ids!=null && ids.length>0) {
			Set<Long> rids = new HashSet<Long>();
			for(int i=0; i<ids.length; i++) {
				if(moduIdSet.contains(ids[i])) {
					rids.add(ids[i]);
				}
			}
			if(rids.size() == 0) {
				return null;
			}else {
				return rids;
			}
		}else {
			return moduIdSet;
		}
	}
	
	
	
		
	
	@Override
	public List<SysModu> getAllModus(Long opId, CSysModu cdt, String orders, Boolean beeauth) {
		BinaryUtils.checkEmpty(opId, "opId");
		
		if(cdt == null) cdt = new CSysModu();
		cdt.setStatus(1);
				
		List<SysModu> modus = null;
		
		Set<Long> authModuSet = null;
		
		//如果带权限控制
		if(beeauth==null || beeauth.booleanValue()) {
//			cdt.setModuTypes(new Integer[]{2,3,4});
			
			authModuSet = getOpAuthModuIds(opId, cdt);
			if(authModuSet==null || authModuSet.size()==0) return new ArrayList<SysModu>();
			cdt.setIds(authModuSet.toArray(new Long[0]));
		}
		modus = moduDao.selectList(cdt, orders);
		
		return modus;
	}

	
	
	@Override
	public Long[] getAllModuIds(Long opId, CSysModu cdt, String orders, Boolean beeauth) {
		List<SysModu> modus = getAllModus(opId, cdt, orders, beeauth);
		Long[] ids = new Long[modus.size()];
		for(int i=0; i<ids.length; i++) {
			ids[i] = modus.get(i).getId();
		}
		return ids;
	}
	
	
	
	
	@Override
	public List<SysMenu> getAllMenus(Long opId, CSysMenu cdt, String orders, Boolean beeauth) {
		BinaryUtils.checkEmpty(opId, "opId");
		
		List<SysMenu> menus = null;
		
		//如果带权限控制
		if(beeauth==null || beeauth.booleanValue()) {
			List<SysModu> modus = getAllModus(opId, null, null, beeauth);
			
			if(modus!=null && modus.size()>0) {
				Long[] moduIds = new Long[modus.size()];
				for(int i=0; i<moduIds.length; i++) {
					moduIds[i] = modus.get(i).getId();
				}
				
				if(cdt == null) cdt = new CSysMenu();
				cdt.setModuIds(moduIds);
				cdt.setStatus(1);
//				cdt.setMenuTypes(new Integer[]{2,3,4});
				
				menus = menuDao.selectList(cdt, orders);
			}
		}else {
			if(cdt == null) cdt = new CSysMenu();
			cdt.setStatus(1);
			menus = menuDao.selectList(cdt, orders);
		}
		
		if(menus == null) menus = new ArrayList<SysMenu>();
		
		return menus;
	}
	


	@Override
	public boolean verifyModuId(Long opId, Long moduId) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(moduId, "moduId");
		
		CSysModu cdt = new CSysModu();
		cdt.setId(moduId);
		cdt.setStatus(1);
		List<SysModu> modus = moduDao.selectList(cdt, null);
		if(modus.size() == 0) throw new ServiceException(" is not found modu by id '"+moduId+"'! ");
		SysModu modu = modus.get(0);
		
		return verifyModu(opId, modu);
	}
	
	
	
	@Override
	public boolean verifyModu(Long opId, SysModu modu) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(modu, "modu");
		
		Long[] roleIds = getOpRoleIds(opId);
		if(roleIds==null || roleIds.length==0) return false;
		
		CSysModuRole cdt = new CSysModuRole();
		cdt.setModuId(modu.getId());
		cdt.setRoleIds(roleIds);
		long count = moduRoleDao.selectCount(cdt);
		
		return count > 0;
	}





	@Override
	public boolean verifyModuCode(Long opId, String moduCode) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(moduCode, "moduCode");
		
		CSysModu cdt = new CSysModu();
		cdt.setModuCodeEqual(moduCode);
		cdt.setStatus(1);
		List<SysModu> modus = moduDao.selectList(cdt, null);
		if(modus.size() == 0) throw new ServiceException(" is not found modu by moduCode '"+moduCode+"'! ");
		SysModu modu = modus.get(0);
		
		return verifyModu(opId, modu);
	}





	
	
	
	
	
}
