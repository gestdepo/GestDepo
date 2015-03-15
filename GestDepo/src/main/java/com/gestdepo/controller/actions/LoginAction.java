package com.gestdepo.controller.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.gestdepo.model.exception.NoUserException;
import com.gestdepo.model.service.LoginService;
import com.gestdepo.model.vo.UserVO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	
	private static final long serialVersionUID = 1L;
	private UserVO userVO;
	
	private Map<String, Object> session;
	private HttpServletRequest request = ServletActionContext.getRequest();
	
	private LoginService loginService;
	
	public String home() {
		return SUCCESS;
	}
	
	// Log Out user
	public String logOut() {
		session.remove("loginId");
		addActionMessage(getText("logout.success"));
		return SUCCESS;
	}
	
	// Login user
	public String login() {
		try {
			loginService.loginUser(userVO);
			session.put("loginId", userVO.getUserName());
		} catch (NoUserException nue) {
			addActionError(getText("login.error"));
		}
		return SUCCESS;
	}
	
	public String preCreateUser() {
		return SUCCESS;
	}

	public String createUser() {
		try {
			userVO = loginService.createAccount(userVO);
		} catch (Exception e) {
			return ERROR;
		}
		
		session.put("loginId", userVO.getUserName());
		
		return SUCCESS;
	}
	
	public UserVO getUserVO() {
		return userVO;
	}
	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}
	
	public void setSession(Map<String, Object> map) {
		this.session = map;
	}
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}