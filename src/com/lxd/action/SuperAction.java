package com.lxd.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;


import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport implements RequestAware,SessionAware, ApplicationAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Map<String, Object> request;
	protected Map<String, Object> session;
	protected Map<String, Object> application;
	
	//DI dependency injection
	//IoC inverse of control
//	public String execute() {
//		request.put("r1", "r1");
//		session.put("s1", "s1");
//		application.put("a1", "a1");
//		return SUCCESS; 
//	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}


	
	
}
