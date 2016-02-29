package com.aic.paas.sys.provider.svc.base.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;
import com.aic.paas.sys.provider.bean.CSysModu;
import com.aic.paas.sys.provider.bean.CSysModuDrop;
import com.aic.paas.sys.provider.bean.CSysModuRes;
import com.aic.paas.sys.provider.bean.SysModu;
import com.aic.paas.sys.provider.bean.SysModuDrop;
import com.aic.paas.sys.provider.bean.SysModuRes;
import com.aic.paas.sys.provider.db.SysModuDao;
import com.aic.paas.sys.provider.db.SysModuDropDao;
import com.aic.paas.sys.provider.db.SysModuResDao;
import com.aic.paas.sys.provider.svc.base.SysModuSvc;


/**
 * SysModu服务实现
 */
public class SysModuSvcImpl implements SysModuSvc {


	@Autowired
	private SysModuDao sysModuDao;
	
	
	@Autowired
	private SysModuDropDao sysModuDropDao;

	
	@Autowired
	private SysModuResDao sysModuResDao;
	
	
	
	@Override
	public Page<SysModu> queryModuPage(Integer pageNum, Integer pageSize, CSysModu cdt, String orders) {
		return sysModuDao.selectPage(pageNum, pageSize, cdt, orders);
	}

	
	
	@Override
	public List<SysModu> queryModuList(CSysModu cdt, String orders) {
		return sysModuDao.selectList(cdt, orders);
	}

	
	@Override
	public long queryModuCount(CSysModu cdt) {
		return sysModuDao.selectCount(cdt);
	}

	
	
	@Override
	public SysModu queryModuById(Long id) {
		return sysModuDao.selectById(id);
	}
	
	

	@Override
	public Integer updateModuById(SysModu record, Long id) {
		return sysModuDao.updateById(record, id);
	}
	
	
	

	@Override
	public Integer updateModuByCdt(SysModu record, CSysModu cdt) {
		return sysModuDao.updateByCdt(record, cdt);
	}
	
	
	

	@Override
	public int[] updateModuBatch(List<SysModu> records) {
		return sysModuDao.updateBatch(records);
	}

	
	
	
	@Override
	public Long saveOrUpdateModu(SysModu record) {
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(record.getModuCode(), "record.moduCode");
		BinaryUtils.checkEmpty(record.getParentId(), "record.parentId");
		
		Long id = record.getId();
		
		boolean isadd = id == null;
		String code = record.getModuCode();
		
		CSysModu cdt = new CSysModu();
		cdt.setModuCode(code);
		List<SysModu> list = sysModuDao.selectList(cdt, null);
		String msg = " is exists record.moduCode '"+code+"'! ";
		if(isadd) {
			if(list.size() > 0) throw new ServiceException(msg);
		}else {
			if(list.size() > 2) throw new ServiceException(msg);
			if(list.size()==1 && !list.get(0).getId().equals(id)) throw new ServiceException(msg);
		}
		
		long parentId = record.getParentId();
		if(isadd) {
			record.setIsLeaf(1);
			id = sysModuDao.insert(record);
			
			if(parentId != 0) {
				SysModu parentup = new SysModu();
				parentup.setIsLeaf(0);
				sysModuDao.updateById(parentup, parentId);
			}
		}else {
			SysModu old = sysModuDao.selectById(id);
			if(old == null) throw new ServiceException(" not found modu by id '"+id+"'! ");
			
			long oldParentId = old.getParentId().longValue();
			sysModuDao.updateById(record, id);
			
			//如果上级节点改变了, 判断之前上级是否还有下级节点, 如果没有下级节点了需要更新isleaf
			if(oldParentId!=parentId && oldParentId!=0) {
				CSysModu parentcdt = new CSysModu();
				parentcdt.setParentId(oldParentId);
				long count = sysModuDao.selectCount(parentcdt);
				
				if(count == 0) {
					SysModu parentup = new SysModu();
					parentup.setIsLeaf(1);
					sysModuDao.updateById(parentup, oldParentId);
				}
			}
		}
		
		return id;
	}

	
	
	
	@Override
	public List<SysModuDrop> queryModuDropList(Long moduId, CSysModuDrop cdt, String orders) {
		BinaryUtils.checkEmpty(moduId, "moduId");
		if(cdt == null) cdt = new CSysModuDrop();
		cdt.setModuId(moduId);
		return sysModuDropDao.selectList(cdt, orders);
	}
	
	

	@Override
	public void saveOrUpdateModuDropList(Long moduId, List<SysModuDrop> records) {
		BinaryUtils.checkEmpty(moduId, "moduId");
		
		CSysModuDrop cdt = new CSysModuDrop();
		cdt.setModuId(moduId);
		sysModuDropDao.deleteByCdt(cdt);
		
		if(records!=null && records.size()>0) {
			for(int i=0; i<records.size(); i++) {
				SysModuDrop record = records.get(i);
				record.setId(null);
				record.setModuId(moduId);
			}
			sysModuDropDao.insertBatch(records);
		}
	}

	
	
	
	@Override
	public List<SysModuRes> queryModuResList(Long moduId, CSysModuRes cdt, String orders) {
		BinaryUtils.checkEmpty(moduId, "moduId");
		if(cdt == null) cdt = new CSysModuRes();
		cdt.setModuId(moduId);		
		return sysModuResDao.selectList(cdt, orders);
	}
	
	
	
	

	@Override
	public void saveOrUpdateModuResList(Long moduId, List<SysModuRes> records) {
		BinaryUtils.checkEmpty(moduId, "moduId");
		
		CSysModuRes cdt = new CSysModuRes();
		cdt.setModuId(moduId);
		sysModuResDao.deleteByCdt(cdt);
		
		if(records!=null && records.size()>0) {
			for(int i=0; i<records.size(); i++) {
				SysModuRes record = records.get(i);
				record.setId(null);
				record.setModuId(moduId);
			}
			sysModuResDao.insertBatch(records);
		}
	}


	
	
	
	

}


