package com.aic.paas.sys.test.db;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.aic.paas.sys.provider.bean.BsSyncdataConfig;
import com.aic.paas.sys.provider.bean.CBsSyncdataConfig;
import com.aic.paas.sys.provider.db.BsSyncdataConfigDao;
import com.binary.framework.test.TestTemplate;

public class BsSyncdataConfigDaoTest extends TestTemplate {
	
	
	BsSyncdataConfigDao dao;
	
	
	@Before
	public void init() {
		dao = getBean(BsSyncdataConfigDao.class);
	}
	
	
	
	@Test
	public void selectList() {
		CBsSyncdataConfig cdt = new CBsSyncdataConfig();
		String orders = "ID";
		List<BsSyncdataConfig> ls = dao.selectList(cdt, orders);
		printList(ls);
	}
	

}
