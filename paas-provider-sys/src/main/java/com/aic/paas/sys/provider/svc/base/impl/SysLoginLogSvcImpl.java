package com.aic.paas.sys.provider.svc.base.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.jdbc.Page;
import com.aic.paas.sys.provider.bean.CSysLoginLog;
import com.aic.paas.sys.provider.bean.SysLoginLog;
import com.aic.paas.sys.provider.db.SysLoginLogDao;
import com.aic.paas.sys.provider.svc.base.SysLoginLogSvc;


/**
 * SysLoginLog服务实现
 */
public class SysLoginLogSvcImpl implements SysLoginLogSvc {


	@Autowired
	private SysLoginLogDao sysLoginLogDao;


	public Page<SysLoginLog> queryPage(Integer pageNum, Integer pageSize, CSysLoginLog cdt, String orders) {
		return sysLoginLogDao.selectPage(pageNum, pageSize, cdt, orders);
	}


	public List<SysLoginLog> queryList(CSysLoginLog cdt, String orders) {
		return sysLoginLogDao.selectList(cdt, orders);
	}


	public long queryCount(CSysLoginLog cdt) {
		return sysLoginLogDao.selectCount(cdt);
	}


	public SysLoginLog queryById(Long id) {
		return sysLoginLogDao.selectById(id);
	}


	public Long save(SysLoginLog record) {
		return sysLoginLogDao.insert(record);
	}


	public long[] saveBatch(List<SysLoginLog> records) {
		return sysLoginLogDao.insertBatch(records);
	}


	public Integer updateById(SysLoginLog record, Long id) {
		return sysLoginLogDao.updateById(record, id);
	}


	public Integer updateByCdt(SysLoginLog record, CSysLoginLog cdt) {
		return sysLoginLogDao.updateByCdt(record, cdt);
	}


	public int[] updateBatch(List<SysLoginLog> records) {
		return sysLoginLogDao.updateBatch(records);
	}


	public Long saveOrUpdate(SysLoginLog record) {
		Long id = record.getId();
		if(id == null) {
			id = sysLoginLogDao.insert(record);
		}else {
			sysLoginLogDao.updateById(record, id);
		}
		return id;
	}


	
}


