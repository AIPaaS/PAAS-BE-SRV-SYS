package com.aic.paas.sys.provider.svc.base.impl;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.sys.provider.bean.CSysCode;
import com.aic.paas.sys.provider.bean.CSysCodeDef;
import com.aic.paas.sys.provider.bean.SysCode;
import com.aic.paas.sys.provider.bean.SysCodeDef;
import com.aic.paas.sys.provider.db.SysCodeDao;
import com.aic.paas.sys.provider.db.SysCodeDefDao;
import com.aic.paas.sys.provider.svc.base.SysCodeSvc;
import com.aic.paas.sys.provider.svc.bean.SysCodeInfo;
import com.binary.core.lang.ArrayUtils;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;


/**
 * SysCode服务实现
 */
public class SysCodeSvcImpl implements SysCodeSvc {

	
	@Autowired
	private SysCodeDefDao sysCodeDefDao;
	

	@Autowired
	private SysCodeDao sysCodeDao;
	
	
	
	

	@Override
	public Page<SysCodeDef> queryDefPage(Integer pageNum, Integer pageSize, CSysCodeDef cdt, String orders) {
		return sysCodeDefDao.selectPage(pageNum, pageSize, cdt, orders);
	}

	@Override
	public List<SysCodeDef> queryDefList(CSysCodeDef cdt, String orders) {
		return sysCodeDefDao.selectList(cdt, orders);
	}

	@Override
	public SysCodeDef queryDefById(Long id) {
		return sysCodeDefDao.selectById(id);
	}

	@Override
	public List<SysCode> queryCodeList(CSysCode cdt, String orders) {
		return sysCodeDao.selectList(cdt, orders);
	}

	
	@Override
	public SysCodeInfo querySysCodeInfo(Long defId, CSysCode cdt, String orders) {
		SysCodeDef def = sysCodeDefDao.selectById(defId);
		if(def == null) return null;
		
		SysCodeInfo info = new SysCodeInfo();
		info.setDef(def);
		
		if(cdt == null) cdt = new CSysCode();
		cdt.setCodeDefId(defId);
		
		List<SysCode> codes = sysCodeDao.selectList(cdt, orders);
		info.setCodes(codes);
		
		return info;
	}

	
	
	@Override
	public Long saveOrUpdate(SysCodeDef def, List<SysCode> codes) {
		BinaryUtils.checkEmpty(def, "def");
		BinaryUtils.checkEmpty(codes, "codes");
		
		Long defId = def.getId();
		boolean isadd = defId == null;
		
		String defCode = def.getDefCode();
		String codeName = def.getCodeName();
		BinaryUtils.checkEmpty(defCode, "def.defCode");
		BinaryUtils.checkEmpty(codeName, "def.codeName");
		
		defCode = defCode.trim();
		def.setDefCode(defCode);
		
		CSysCodeDef cdt = new CSysCodeDef();
		cdt.setDefCode(defCode);
		List<SysCodeDef> list = sysCodeDefDao.selectList(cdt, null);
		String msg = " is exists def.defCode '"+defCode+"'! ";
		if(isadd) {
			if(list.size() > 0) throw new ServiceException(msg);
		}else {
			if(list.size() > 2) throw new ServiceException(msg);
			if(list.size()==1 && !list.get(0).getId().equals(defId)) throw new ServiceException(msg);
		}
		
		Set<String> codeset = new HashSet<String>();
		Set<String> nameset = new HashSet<String>();
		for(int i=0; i<codes.size(); i++) {
			SysCode code = codes.get(i);
			String c = code.getCode();
			String n = code.getName();
			
			if(c==null || (c=c.trim()).length()==0) throw new ServiceException(" the codes["+i+"].code is empty! ");
			if(n==null || (n=n.trim()).length()==0) throw new ServiceException(" the codes["+i+"].name is empty! ");
			
			if(codeset.contains(c)) throw new ServiceException(" is repeated codes["+i+"].code '"+c+"'! ");
			if(nameset.contains(n)) throw new ServiceException(" is repeated codes["+i+"].name '"+n+"'! ");
			
			codeset.add(c);
			nameset.add(n);
			
			code.setCode(c);
			code.setName(n);
		}
		
		defId = sysCodeDefDao.save(def);
		
		if(isadd) {
			for(int i=0; i<codes.size(); i++) {
				SysCode code = codes.get(i);
				code.setCodeDefId(defId);
			}
			sysCodeDao.insertBatch(codes);
		}else {
			CSysCode codecdt = new CSysCode();
			codecdt.setCodeDefId(defId);
			List<SysCode> exists = sysCodeDao.selectList(codecdt, null);
			
			Set<Long> idset = new HashSet<Long>();
			for(int i=0; i<exists.size(); i++) {
				idset.add(exists.get(i).getId());
			}
			Set<Long> upids = new HashSet<Long>();
			
			List<SysCode> inserts = new ArrayList<SysCode>();
			List<SysCode> updates = new ArrayList<SysCode>();
			List<Long> deletes = new ArrayList<Long>();
			
			for(int i=0; i<codes.size(); i++) {
				SysCode code = codes.get(i);
				code.setCodeDefId(defId);
				
				Long id = code.getId();
				if(id!=null && idset.contains(id)) {
					updates.add(code);
					upids.add(id);
				}else {
					code.setId(null);
					inserts.add(code);
				}
			}
			
			//如果库中的ID在更新的ID中不存在, 则删除
			Iterator<Long> itor = idset.iterator();
			while(itor.hasNext()) {
				Long id = itor.next();
				if(!upids.contains(id)) {
					deletes.add(id);
				}
			}
			
			
			if(inserts.size() > 0) sysCodeDao.insertBatch(inserts);
			if(updates.size() > 0) sysCodeDao.updateBatch(updates);
			if(deletes.size() > 0) sysCodeDao.deleteBatch((long[])ArrayUtils.toPrimitiveArray(deletes.toArray(new Long[0])));
		}
		
		return defId;
	}

	
	
	
	
}


