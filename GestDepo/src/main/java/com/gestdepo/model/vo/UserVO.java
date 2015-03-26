package com.gestdepo.model.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserVO extends AccountVO {
	
	private long userId;
	private String name;
	private String lastName;
	private String passwordRepeat;
	
	private Locale locale;
	
	private List<Rol> rols;
	
	public UserVO() {
		this.setUserId(0l);
		this.setEmail("");
		this.setUserName("");
		this.setPassword("");
		
		this.setName("");
		this.setLastName("");
		this.setPasswordRepeat("");
		
		this.setLocale(new Locale(""));
		
		this.setRols(new ArrayList<Rol>());
	}

	public UserVO(Long userId, String email, String userName, String password, String name, String lastName, String passwordRepeated, Locale locale, List<Rol> rols) {
		this.setUserId(userId);
		this.setEmail(email);
		this.setUserName(userName);
		this.setPassword(password);
		
		this.setName(name);
		this.setLastName(lastName);
		this.setPasswordRepeat(passwordRepeated);
		
		this.setLocale(locale);
		
		this.setRols(rols);
		
	}

	public UserVO(UserVO userVO) {
		new UserVO(userVO.getUserId(), userVO.getEmail(), userVO.getUserName(), userVO.getPassword(), userVO.getName(), userVO.getLastName(), userVO.getPasswordRepeat(), userVO.getLocale(), userVO.getRols());
	}
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPasswordRepeat() {
		return passwordRepeat;
	}
	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public List<Rol> getRols() {
		return rols;
	}
	public void setRols(List<Rol> rols) {
		this.rols = rols;
	}
	
}
