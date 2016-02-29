package com.aic.paas.sys.provider.svc.bean;

import java.io.Serializable;
import java.util.List;

import com.aic.paas.sys.provider.bean.SysModu;
import com.aic.paas.sys.provider.bean.SysModuDrop;
import com.aic.paas.sys.provider.bean.SysModuRes;

public class SysModuInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	/** 模块对象 **/
	private SysModu modu;
	
	
	/** 模块资源 **/
	private List<SysModuRes> moduResList;

	
	
	/** 模块所需要的代码表 **/
	private List<SysModuDrop> moduDropList;



	
	
	public SysModu getModu() {
		return modu;
	}



	public void setModu(SysModu modu) {
		this.modu = modu;
	}



	public List<SysModuRes> getModuResList() {
		return moduResList;
	}



	public void setModuResList(List<SysModuRes> moduResList) {
		this.moduResList = moduResList;
	}



	public List<SysModuDrop> getModuDropList() {
		return moduDropList;
	}



	public void setModuDropList(List<SysModuDrop> moduDropList) {
		this.moduDropList = moduDropList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
