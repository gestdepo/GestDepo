package com.gestdepo.controller.actions;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.Action;


public class HomeAction implements Action {
	
	private static final long serialVersionUID = 1L;
	
	private HttpServletRequest request;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
