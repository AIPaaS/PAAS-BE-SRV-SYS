package com.aic.paas.sys.provider.svc.base.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.sys.provider.bean.CSysOp;
import com.aic.paas.sys.provider.bean.SysOp;
import com.aic.paas.sys.provider.db.SysOpDao;
import com.aic.paas.sys.provider.svc.base.SysOpSvc;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;


/**
 * SysOp服务实现
 */
public class SysOpSvcImpl implements SysOpSvc {


	@Autowired
	private SysOpDao sysOpDao;
	
	
	private String defaultPwd;

	
	
	public void setDefaultPwd(String defaultPwd) {
		if(defaultPwd != null) {
			this.defaultPwd = defaultPwd.trim();
		}
	}
		

	@Override
	public Page<SysOp> queryPage(Integer pageNum, Integer pageSize, CSysOp cdt, String orders) {
		return sysOpDao.selectPage(pageNum, pageSize, cdt, orders);
	}


	@Override
	public List<SysOp> queryList(CSysOp cdt, String orders) {
		return sysOpDao.selectList(cdt, orders);
	}
	
	
	
	@Override
	public List<SysOp> queryList(Integer pageNum, Integer pageSize, CSysOp cdt, String orders) {
		return sysOpDao.selectList(pageNum, pageSize, cdt, orders);
	}

	
	
	@Override
	public Page<SysOp> queryPageByOrg(Integer pageNum, Integer pageSize, Long orgId, Boolean direct, Boolean admin, CSysOp cdt, String orders) {
		return sysOpDao.selectPageByOrg(pageNum, pageSize, orgId, direct, admin, cdt, orders);
	}


	@Override
	public List<SysOp> queryListByOrg(Long orgId, Boolean direct, Boolean admin, CSysOp cdt, String orders) {
		return sysOpDao.selectListByOrg(orgId, direct, admin, cdt, orders);
	}

	


	@Override
	public long queryCount(CSysOp cdt) {
		return sysOpDao.selectCount(cdt);
	}


	@Override
	public SysOp queryById(Long id) {
		return sysOpDao.selectById(id);
	}


	@Override
	public Long saveOrUpdate(SysOp record) {
		Long id = record.getId();
		boolean isadd = id == null;
		
		String opCode = record.getOpCode();
		String loginCode = record.getLoginCode();
		
		BinaryUtils.checkEmpty(opCode, "record.opCode");
		BinaryUtils.checkEmpty(loginCode, "record.loginCode");
		
		record.setOpCode(opCode=opCode.trim());
		record.setLoginCode(loginCode=loginCode.trim());
		
		CSysOp cdt = new CSysOp();
		cdt.setOpCode(opCode);
		List<SysOp> list = sysOpDao.selectList(cdt, null);
		String msg = " is exists record.opCode '"+opCode+"'! ";
		if(isadd) {
			if(list.size() > 0) throw new ServiceException(msg);
		}else {
			if(list.size() > 2) throw new ServiceException(msg);
			if(list.size()==1 && !list.get(0).getId().equals(id)) throw new ServiceException(msg);
		}
		
		cdt = new CSysOp();
		cdt.setLoginCode(loginCode);
		list = sysOpDao.selectList(cdt, null);
		msg = " is exists record.loginCode '"+loginCode+"'! ";
		if(isadd) {
			if(list.size() > 0) throw new ServiceException(msg);
		}else {
			if(list.size() > 2) throw new ServiceException(msg);
			if(list.size()==1 && !list.get(0).getId().equals(id)) throw new ServiceException(msg);
		}
		
		if(isadd) {
			String pwd = record.getLoginPasswd();
			if(BinaryUtils.isEmpty(pwd)) {
				if(BinaryUtils.isEmpty(this.defaultPwd)) {
					throw new ServiceException(" the loginPasswd or defaultPwd is empty! ");
				}
				record.setIsUpdatePwd(1);
				record.setLoginPasswd(this.defaultPwd);
			}
			id = sysOpDao.insert(record);
		}else {
			sysOpDao.updateById(record, id);
		}
		
		return id;
	}


	@Override
	public Integer updateById(SysOp record, Long id) {
		return sysOpDao.updateById(record, id);
	}


	@Override
	public Integer updateByCdt(SysOp record, CSysOp cdt) {
		return sysOpDao.updateByCdt(record, cdt);
	}


	

	


}


