package com.aic.paas.sys.test.db;

import org.junit.Before;
import org.junit.Test;

import com.aic.paas.sys.provider.bean.BsSyncdataConfig;
import com.aic.paas.sys.provider.bean.CBsSyncdataConfig;
import com.aic.paas.sys.provider.db.BsSyncdataConfigDao;
import com.binary.framework.test.TestTemplate;
import com.binary.jdbc.Page;

public class SysOpDaoTest extends TestTemplate {
	
	
	BsSyncdataConfigDao dao;
	
	
	@Before
	public void init() {
		dao = getBean(BsSyncdataConfigDao.class);
	}
	
	
	
	@Test
	public void selectPage() {
		Integer pageNum = 1;
		Integer pageSize = 20;
		CBsSyncdataConfig cdt = new CBsSyncdataConfig();
		String orders = "ID";
		
		Page<BsSyncdataConfig> page = dao.selectPage(pageNum, pageSize, cdt, orders);
		printPage(page);
	}
	
	

}
