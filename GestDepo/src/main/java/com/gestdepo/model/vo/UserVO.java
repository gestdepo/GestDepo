package com.gestdepo.model.vo;

public class UserVO {
	
	private String userName;
	private String name;
	private String lastName;
	private String email;
	private String password;
	private String passwordRepeat;
	
	public UserVO() {
		this.userName = "";
		this.password = "";
	}

	public UserVO(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public UserVO(UserVO userVO) {
		new UserVO(userVO.getUserName(), userVO.getPassword());
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswordRepeat() {
		return passwordRepeat;
	}
	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
}
