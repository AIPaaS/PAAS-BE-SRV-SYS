package com.aic.paas.sys.provider.svc.base.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;
import com.aic.paas.sys.provider.bean.CSysMenu;
import com.aic.paas.sys.provider.bean.SysMenu;
import com.aic.paas.sys.provider.db.SysMenuDao;
import com.aic.paas.sys.provider.svc.base.SysMenuSvc;


/**
 * SysMenu服务实现
 */
public class SysMenuSvcImpl implements SysMenuSvc {


	@Autowired
	private SysMenuDao sysMenuDao;


	@Override
	public Page<SysMenu> queryPage(Integer pageNum, Integer pageSize, CSysMenu cdt, String orders) {
		return sysMenuDao.selectPage(pageNum, pageSize, cdt, orders);
	}


	@Override
	public List<SysMenu> queryList(CSysMenu cdt, String orders) {
		return sysMenuDao.selectList(cdt, orders);
	}


	@Override
	public long queryCount(CSysMenu cdt) {
		return sysMenuDao.selectCount(cdt);
	}


	@Override
	public SysMenu queryById(Long id) {
		return sysMenuDao.selectById(id);
	}




	@Override
	public Integer updateById(SysMenu record, Long id) {
		return sysMenuDao.updateById(record, id);
	}


	@Override
	public Integer updateByCdt(SysMenu record, CSysMenu cdt) {
		return sysMenuDao.updateByCdt(record, cdt);
	}



	@Override
	public Long saveOrUpdate(SysMenu record) {
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(record.getMenuCode(), "record.menuCode");
		BinaryUtils.checkEmpty(record.getParentId(), "record.parentId");
		
		Long id = record.getId();
		
		boolean isadd = id == null;
		String code = record.getMenuCode();
		
		CSysMenu cdt = new CSysMenu();
		cdt.setMenuCode(code);
		List<SysMenu> list = sysMenuDao.selectList(cdt, null);
		String msg = " is exists record.menuCode '"+code+"'! ";
		if(isadd) {
			if(list.size() > 0) throw new ServiceException(msg);
		}else {
			if(list.size() > 2) throw new ServiceException(msg);
			if(list.size()==1 && !list.get(0).getId().equals(id)) throw new ServiceException(msg);
		}
		
		long parentId = record.getParentId();
		if(isadd) {
			record.setIsLeaf(1);
			id = sysMenuDao.insert(record);
			
			if(parentId != 0) {
				SysMenu parentup = new SysMenu();
				parentup.setIsLeaf(0);
				sysMenuDao.updateById(parentup, parentId);
			}
		}else {
			SysMenu old = sysMenuDao.selectById(id);
			if(old == null) throw new ServiceException(" not found menu by id '"+id+"'! ");
			
			long oldParentId = old.getParentId().longValue();
			sysMenuDao.updateById(record, id);
			
			//如果上级节点改变了, 判断之前上级是否还有下级节点, 如果没有下级节点了需要更新isleaf
			if(oldParentId!=parentId && oldParentId!=0) {
				CSysMenu parentcdt = new CSysMenu();
				parentcdt.setParentId(oldParentId);
				long count = sysMenuDao.selectCount(parentcdt);
				
				if(count == 0) {
					SysMenu parentup = new SysMenu();
					parentup.setIsLeaf(1);
					sysMenuDao.updateById(parentup, oldParentId);
				}
			}
		}
		
		return id;
	}

	
}


