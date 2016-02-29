package com.aic.paas.sys.test.db;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.aic.paas.sys.provider.bean.CSysOp;
import com.aic.paas.sys.provider.bean.SysOp;
import com.aic.paas.sys.provider.db.SysOpDao;
import com.binary.framework.test.TestTemplate;
import com.binary.jdbc.Page;

public class SysOpDaoTest extends TestTemplate {
	
	
	SysOpDao opDao;
	
	
	@Before
	public void init() {
		opDao = getBean(SysOpDao.class);
	}
	
	
	
	@Test
	public void selectPageByOrg() {
		Integer pageNum = 1;
		Integer pageSize = 20;
		Long orgId = 1l;
		Boolean direct = true;
		Boolean admin = false;
		CSysOp cdt = new CSysOp();
		String orders = "ID";
		
		Page<SysOp> page = opDao.selectPageByOrg(pageNum, pageSize, orgId, direct, admin, cdt, orders);
		printPage(page);
	}
	
	
	
	@Test
	public void selectListByOrg() {
		Long orgId = 1l;
		Boolean direct = false;
		Boolean admin = false;
		CSysOp cdt = new CSysOp();
		String orders = "ID";
		
		List<SysOp> ls = opDao.selectListByOrg(orgId, direct, admin, cdt, orders);
		printList(ls);
	}
	

}
