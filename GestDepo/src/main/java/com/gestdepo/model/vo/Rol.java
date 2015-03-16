package com.gestdepo.model.vo;

public class Rol {
	
	private long rolId;
	private String name;
	
	public Rol() {
		this.setRolId(0L);
		this.setName("");
	}
	public Rol(long rolId, String name) {
		this.setRolId(rolId);
		this.setName(name);
	}
	
	public long getRolId() {
		return rolId;
	}
	public void setRolId(long rolId) {
		this.rolId = rolId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
