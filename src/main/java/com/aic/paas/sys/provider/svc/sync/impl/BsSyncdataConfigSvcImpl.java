package com.aic.paas.sys.provider.svc.sync.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.sys.provider.bean.BsSyncdataConfig;
import com.aic.paas.sys.provider.bean.CBsSyncdataConfig;
import com.aic.paas.sys.provider.db.BsSyncdataConfigDao;
import com.aic.paas.sys.provider.svc.sync.BsSyncdataConfigSvc;
import com.binary.jdbc.Page;

public class BsSyncdataConfigSvcImpl implements BsSyncdataConfigSvc {
	
	
	@Autowired
	BsSyncdataConfigDao syncDataConfigDao;
	
	

	@Override
	public Page<BsSyncdataConfig> queryPage(Integer pageNum, Integer pageSize, CBsSyncdataConfig cdt, String orders) {
		return syncDataConfigDao.selectPage(pageNum, pageSize, cdt, orders);
	}
	
	

	@Override
	public List<BsSyncdataConfig> queryList(CBsSyncdataConfig cdt, String orders) {
		return syncDataConfigDao.selectList(cdt, orders);
	}
	
	

	@Override
	public long queryCount(CBsSyncdataConfig cdt) {
		return syncDataConfigDao.selectCount(cdt);
	}
	
	

	@Override
	public BsSyncdataConfig queryById(Long id) {
		return syncDataConfigDao.selectById(id);
	}
	
	

	@Override
	public Long saveOrUpdate(BsSyncdataConfig record) {
		return syncDataConfigDao.save(record);
	}
	
	
	
	

}
