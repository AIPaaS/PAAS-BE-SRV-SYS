package com.aic.paas.sys.provider.svc.bean;

import java.io.Serializable;
import java.util.List;

import com.aic.paas.sys.provider.bean.SysCode;

public class SysCodeBatch implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String viewName;
	
	
	private List<SysCode> codeList;
	
	
	
	public SysCodeBatch() {
	}
	
	
	public SysCodeBatch(String viewName, List<SysCode> codeList) {
		this.viewName = viewName;
		this.codeList = codeList;
	}






	public String getViewName() {
		return viewName;
	}


	public void setViewName(String viewName) {
		this.viewName = viewName;
	}


	public List<SysCode> getCodeList() {
		return codeList;
	}


	public void setCodeList(List<SysCode> codeList) {
		this.codeList = codeList;
	}
	
	
	
	
	

}
