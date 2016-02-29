package com.aic.paas.sys.provider.svc.frame.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.sys.provider.bean.CSysCode;
import com.aic.paas.sys.provider.bean.CSysCodeDef;
import com.aic.paas.sys.provider.bean.CSysLoginLog;
import com.aic.paas.sys.provider.bean.CSysMenu;
import com.aic.paas.sys.provider.bean.CSysModu;
import com.aic.paas.sys.provider.bean.CSysModuDrop;
import com.aic.paas.sys.provider.bean.CSysModuRes;
import com.aic.paas.sys.provider.bean.CSysOp;
import com.aic.paas.sys.provider.bean.CSysOpRole;
import com.aic.paas.sys.provider.bean.CSysRole;
import com.aic.paas.sys.provider.bean.SysCode;
import com.aic.paas.sys.provider.bean.SysCodeDef;
import com.aic.paas.sys.provider.bean.SysLoginLog;
import com.aic.paas.sys.provider.bean.SysMenu;
import com.aic.paas.sys.provider.bean.SysModu;
import com.aic.paas.sys.provider.bean.SysModuDrop;
import com.aic.paas.sys.provider.bean.SysModuRes;
import com.aic.paas.sys.provider.bean.SysOp;
import com.aic.paas.sys.provider.bean.SysOpRole;
import com.aic.paas.sys.provider.bean.SysRole;
import com.aic.paas.sys.provider.db.SysLoginLogDao;
import com.aic.paas.sys.provider.db.SysMenuDao;
import com.aic.paas.sys.provider.db.SysModuDao;
import com.aic.paas.sys.provider.db.SysModuDropDao;
import com.aic.paas.sys.provider.db.SysModuResDao;
import com.aic.paas.sys.provider.db.SysOpDao;
import com.aic.paas.sys.provider.db.SysOpRoleDao;
import com.aic.paas.sys.provider.db.SysRoleDao;
import com.aic.paas.sys.provider.svc.auth.SysResAuthSvc;
import com.aic.paas.sys.provider.svc.base.SysCodeSvc;
import com.aic.paas.sys.provider.svc.bean.SysCodeBatch;
import com.aic.paas.sys.provider.svc.bean.SysModuInfo;
import com.aic.paas.sys.provider.svc.frame.SysFrameSvc;
import com.binary.core.encrypt.Encrypt;
import com.binary.core.lang.Conver;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;

public class SysFrameSvcImpl implements SysFrameSvc {
	
	
	@Autowired
	SysCodeSvc sysCodeSvc;
	
	@Autowired
	SysResAuthSvc sysResAuthSvc;
	
	
	@Autowired
	SysModuDao sysModuDao;
	
	@Autowired
	SysMenuDao menuDao;
	
	@Autowired
	SysModuResDao moduResDao;
	
	@Autowired
	SysModuDropDao moduDropDao;
	
	@Autowired
	SysOpDao opDao;
	
	@Autowired
	SysRoleDao roleDao;
	
	@Autowired
	SysOpRoleDao opRoleDao;
	
	@Autowired
	SysLoginLogDao loginLogDao;
	

	@Override
	public List<SysCode> getCodeList(String defCode, String[] codes) {
		BinaryUtils.checkEmpty(defCode, "defCode");

		CSysCodeDef defcdt = new CSysCodeDef();
		defcdt.setDefCode(defCode.trim().toUpperCase());
		defcdt.setStatus(Integer.valueOf(1));
		List<SysCodeDef> defs = sysCodeSvc.queryDefList(defcdt, null);
		if (defs.size() == 0)
			throw new ServiceException(" is not found syscode-def by code '"
					+ defCode + "'! ");
		SysCodeDef def = (SysCodeDef) defs.get(0);

		CSysCode cdt = new CSysCode();
		cdt.setCodeDefId(def.getId());
		cdt.setCodes(codes);
		cdt.setStatus(Integer.valueOf(1));

		return sysCodeSvc.queryCodeList(cdt, "order_No asc, code asc");
	}

	
	private String[] validParamDefCodes(String[] defCodes) {
	    String[] array = (String[])defCodes.clone();
	    for (int i = 0; i < array.length; i++) {
	      if ((array[i] == null) || ((array[i]=array[i].trim().toUpperCase()).length() == 0)) {
	        throw new ServiceException(" the def-codes[" + i + "] is empty in [" + Conver.toString(defCodes) + "]!");
	      }
	    }
	    return array;
	}
	
	
	

	@Override
	public List<SysCodeBatch> getCodeListBatch(String[] defCodes) {
		BinaryUtils.checkEmpty(defCodes, "defCodes");

		CSysCodeDef defcdt = new CSysCodeDef();
		defcdt.setDefCodes(validParamDefCodes(defCodes));
		defcdt.setStatus(Integer.valueOf(1));
		List<SysCodeDef> defs = sysCodeSvc.queryDefList(defcdt, null);

		Map<String, List<SysCode>> map = new HashMap<String, List<SysCode>>();
		if (defs.size() > 0) {
			Long[] defIds = new Long[defs.size()];
			Map<Long, String> deficemap = new HashMap<Long, String>();

			for (int i = 0; i < defs.size(); i++) {
				SysCodeDef def = (SysCodeDef) defs.get(i);
				defIds[i] = def.getId();
				deficemap.put(def.getId(), def.getDefCode());
			}

			CSysCode cdt = new CSysCode();
			cdt.setCodeDefIds(defIds);
			cdt.setStatus(Integer.valueOf(1));
			List<SysCode> codes = sysCodeSvc.queryCodeList(cdt, "order_No asc, code asc");

			for (int i = 0; i < codes.size(); i++) {
				SysCode sc = codes.get(i);
				String defCode = (String) deficemap.get(sc.getCodeDefId());

				List<SysCode> list = map.get(defCode);
				if (list == null) {
					list = new ArrayList<SysCode>();
					map.put(defCode, list);
				}

				list.add(sc);
			}
		}
		
		
		List<SysCodeBatch> btachList = new ArrayList<SysCodeBatch>();
		Iterator<Entry<String, List<SysCode>>> itor = map.entrySet().iterator();
		while(itor.hasNext()) {
			Entry<String, List<SysCode>> e = itor.next();
			btachList.add(new SysCodeBatch(e.getKey(), e.getValue()));
		}

		return btachList;
	}
	

	
	
	@Override
	public SysModuInfo getModuInfoById(Long moduId) {
		BinaryUtils.checkEmpty(moduId, "moduId");
		
		CSysModu cdt = new CSysModu();
		cdt.setId(moduId);
		cdt.setStatus(1);
		List<SysModu> moduList = sysModuDao.selectList(cdt, null);
		return toModuInfo(moduList);
	}

	
	@Override
	public SysModuInfo getModuInfoByCode(String moduCode) {
		BinaryUtils.checkEmpty(moduCode, "moduCode");
		
		CSysModu cdt = new CSysModu();
		cdt.setStatus(1);
		cdt.setModuCode(moduCode);
		List<SysModu> moduList = sysModuDao.selectList(cdt, null);
		return toModuInfo(moduList);
	}
	
	
	
	private SysModuInfo toModuInfo(List<SysModu> moduList) {
		if(moduList==null || moduList.size()==0) {
			return null;
		}
		
		SysModu modu = moduList.get(0);
		SysModuInfo info = new SysModuInfo();
		info.setModu(modu);

		CSysModuDrop dropcdt = new CSysModuDrop();
		dropcdt.setModuId(modu.getId());
		List<SysModuDrop> dropList = moduDropDao.selectList(dropcdt, null);
		
		CSysModuRes rescdt = new CSysModuRes();
		rescdt.setModuId(modu.getId());
		List<SysModuRes> resList = moduResDao.selectList(rescdt, "ORDER_NO, ID");
		
		info.setModuDropList(dropList);
		info.setModuResList(resList);
		
		return info;
	}
	
	

	@Override
	public List<SysModu> getModuList(CSysModu cdt, String orders) {
		if(cdt == null) cdt = new CSysModu();
		cdt.setStatus(1);
		return sysModuDao.selectList(cdt, null);
	}

	@Override
	public List<SysModuDrop> getModuDropList(Long moduId, CSysModuDrop cdt, String orders) {
		BinaryUtils.checkEmpty(moduId, "moduId");
		if(cdt == null) cdt = new CSysModuDrop();
		cdt.setModuId(moduId);
		return moduDropDao.selectList(cdt, null);
	}
	
	
	

	@Override
	public List<SysModuRes> getModuResList(Long moduId, CSysModuRes cdt, String orders) {
		BinaryUtils.checkEmpty(moduId, "moduId");
		if(cdt == null) cdt = new CSysModuRes();
		cdt.setModuId(moduId);
		return moduResDao.selectList(cdt, null);
	}



	@Override
	public List<SysMenu> getMenuList(CSysMenu cdt, String orders) {
		if(cdt == null) cdt = new CSysMenu();
		cdt.setStatus(1);
		return menuDao.selectList(cdt, orders);
	}


	
	@Override
	public SysOp getOpById(Long opId) {
		BinaryUtils.checkEmpty(opId, "opId");
		CSysOp cdt = new CSysOp();
		cdt.setId(opId);
		List<SysOp> ls = getOpList(cdt, null);
		return ls.size()>0 ? ls.get(0) : null;
	}


	@Override
	public SysOp getOpByCode(String opCode) {
		BinaryUtils.checkEmpty(opCode, "opCode");
		CSysOp cdt = new CSysOp();
		cdt.setOpCode(opCode);
		List<SysOp> ls = getOpList(cdt, null);
		if(ls.size() > 1) throw new ServiceException(" There are multiple the same opCode '"+opCode+"'! ");
		return ls.size()>0 ? ls.get(0) : null;
	}


	@Override
	public SysOp getOpByLoginCode(String loginCode) {
		BinaryUtils.checkEmpty(loginCode, "loginCode");
		CSysOp cdt = new CSysOp();
		cdt.setLoginCode(loginCode);
		List<SysOp> ls = getOpList(cdt, null);
		if(ls.size() > 1) throw new ServiceException(" There are multiple the same loginCode '"+loginCode+"'! ");
		return ls.size()>0 ? ls.get(0) : null;
	}
	
	
	@Override
	public List<SysOp> getOpList(CSysOp cdt, String orders) {
		if(cdt == null) cdt = new CSysOp();
		cdt.setStatus(1);
		return opDao.selectList(cdt, orders);
	}
	
	
	
	public Integer updateOpPwd(Long opId, String oldPwd, String newPwd) {
		BinaryUtils.checkEmpty(opId, "opId");
		BinaryUtils.checkEmpty(oldPwd, "oldPwd");
		BinaryUtils.checkEmpty(newPwd, "newPwd");
		
		if(newPwd.length() < 6) throw new ServiceException(" the newPwd.length < 6 ! ");
		
		SysOp op = opDao.selectById(opId);
		String pwd = op.getLoginPasswd();
		String inputpwd = Encrypt.encrypt(oldPwd);
		if(!pwd.equals(inputpwd)) throw new ServiceException(" oldPwd is wrong ! ");
		
		SysOp upop = new SysOp();
		upop.setLoginPasswd(Encrypt.encrypt(newPwd));
		upop.setIsUpdatePwd(0);
		return opDao.updateById(upop, opId);
	}
	
	
	
	@Override
	public List<SysOpRole> getOpRoles(Long opId, CSysOpRole cdt, String orders) {
		if(cdt == null) cdt = new CSysOpRole();
		cdt.setOpId(opId);
		return opRoleDao.selectList(cdt, orders);
	}
	


	@Override
	public List<SysRole> getRoleList(CSysRole cdt, String orders) {
		if(cdt == null) cdt = new CSysRole();
		cdt.setStatus(1);
		return roleDao.selectList(cdt, orders);
	}


	
	@Override
	public void setOpLoginLog(SysOp op, String authCode, String sessionId) {
		BinaryUtils.checkEmpty(op, "op");
		BinaryUtils.checkEmpty(authCode, "authCode");
		BinaryUtils.checkEmpty(sessionId, "sessionId");
		BinaryUtils.checkEmpty(op.getId(), "op.id");
		
		Long time = BinaryUtils.getNumberDateTime();
		SysLoginLog record = new SysLoginLog();
		
		record.setUserId(op.getId());
		record.setUserCode(op.getOpCode());
		record.setUserName(op.getOpName());
		record.setSessionId(sessionId);
		record.setLoginTime(time);
		Long loginLogId = loginLogDao.insert(record);
		
		SysOp upop = new SysOp();
		upop.setLastLoginLogId(loginLogId);
		upop.setLoginAuthCode(authCode);
		
		//--计算其他需要字段
		opDao.updateById(upop, op.getId());
	}

	

	@Override
	public void setOpLogoutLog(Long opId, String sessionId) {
		CSysLoginLog cdt = new CSysLoginLog();
		cdt.setUserId(opId);
		cdt.setSessionId(sessionId);
		
		SysLoginLog record = new SysLoginLog();
		record.setLogoutTime(BinaryUtils.getNumberDateTime());
		
		loginLogDao.updateByCdt(record, cdt);
	}
	

	@Override
	public List<SysModu> getAllModus(Long opId, CSysModu cdt, String orders, Boolean beeauth) {
		return sysResAuthSvc.getAllModus(opId, cdt, orders, beeauth);
	}


	@Override
	public Long[] getAllModuIds(Long opId, CSysModu cdt, String orders, Boolean beeauth) {
		return sysResAuthSvc.getAllModuIds(opId, cdt, orders, beeauth);
	}


	@Override
	public List<SysMenu> getAllMenus(Long opId, CSysMenu cdt, String orders, Boolean beeauth) {
		return sysResAuthSvc.getAllMenus(opId, cdt, orders, beeauth);
	}


	@Override
	public boolean verifyModuId(Long opId, Long moduId) {
		return sysResAuthSvc.verifyModuId(opId, moduId);
	}


	@Override
	public boolean verifyModu(Long opId, SysModu modu) {
		return sysResAuthSvc.verifyModu(opId, modu);
	}

	
	
	
}
