package com.aic.paas.sys.provider.svc.base.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.jdbc.Page;
import com.aic.paas.sys.provider.bean.CSysRegion;
import com.aic.paas.sys.provider.bean.SysRegion;
import com.aic.paas.sys.provider.db.SysRegionDao;
import com.aic.paas.sys.provider.svc.base.SysRegionSvc;


/**
 * SysRegion服务实现
 */
public class SysRegionSvcImpl implements SysRegionSvc {


	@Autowired
	private SysRegionDao sysRegionDao;


	public Page<SysRegion> queryPage(Integer pageNum, Integer pageSize, CSysRegion cdt, String orders) {
		return sysRegionDao.selectPage(pageNum, pageSize, cdt, orders);
	}


	public List<SysRegion> queryList(CSysRegion cdt, String orders) {
		return sysRegionDao.selectList(cdt, orders);
	}


	public long queryCount(CSysRegion cdt) {
		return sysRegionDao.selectCount(cdt);
	}


	public SysRegion queryById(Long id) {
		return sysRegionDao.selectById(id);
	}


	public Long save(SysRegion record) {
		return sysRegionDao.insert(record);
	}


	public long[] saveBatch(List<SysRegion> records) {
		return sysRegionDao.insertBatch(records);
	}


	public Integer updateById(SysRegion record, Long id) {
		return sysRegionDao.updateById(record, id);
	}


	public Integer updateByCdt(SysRegion record, CSysRegion cdt) {
		return sysRegionDao.updateByCdt(record, cdt);
	}


	public int[] updateBatch(List<SysRegion> records) {
		return sysRegionDao.updateBatch(records);
	}


	public Long saveOrUpdate(SysRegion record) {
		Long id = record.getId();
		if(id == null) {
			id = sysRegionDao.insert(record);
		}else {
			sysRegionDao.updateById(record, id);
		}
		return id;
	}


	public Integer removeById(Long id) {
		return sysRegionDao.deleteById(id);
	}


	public Integer removeByCdt(CSysRegion cdt) {
		return sysRegionDao.deleteByCdt(cdt);
	}


	public int[] removeBatch(long[] ids) {
		return sysRegionDao.deleteBatch(ids);
	}


}


