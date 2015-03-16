package com.gestdepo.controller.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.gestdepo.model.exception.NoUserException;
import com.gestdepo.model.service.AccountService;
import com.gestdepo.model.vo.Rol;
import com.gestdepo.model.vo.UserVO;
import com.gestdepo.utils.AccountUtils;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	
	private static final long serialVersionUID = 1L;
	private UserVO userVO;
	
	private List<Rol> rols = new ArrayList<Rol>();
	private String choosenRoles;
	
	private Map<String, Object> session;
	private HttpServletRequest request = ServletActionContext.getRequest();
	
	private AccountService accountService;
	
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
			accountService.loginUser(userVO);
			session.put("loginId", userVO.getUserName());
		} catch (NoUserException nue) {
			addActionError(getText("login.error"));
		}
		return SUCCESS;
	}
	
	public String preCreateUser() {
		this.setRols(AccountUtils.getPossibleRols());
		return SUCCESS;
	}

	public String createUser() {
		
		userVO.setRols(AccountUtils.transformRols(choosenRoles));
		
		try {
			userVO = accountService.createAccount(userVO);
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
	public List<Rol> getRols() {
		return rols;
	}
	public void setRols(List<Rol> rols) {
		this.rols = rols;
	}

	public String getChoosenRoles() {
		return choosenRoles;
	}

	public void setChoosenRoles(String choosenRoles) {
		this.choosenRoles = choosenRoles;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
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