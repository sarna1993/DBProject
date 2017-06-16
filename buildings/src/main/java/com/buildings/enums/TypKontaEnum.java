package com.buildings.enums;

public enum TypKontaEnum {

	LOKATOR("LOKATOR"),
	KSIEGOWA("KSIEGOWA"),
	TECHNICZNY("TECHNICZNY"),
	MANAGER("MANAGER"),
	ADMIN("ADMIN");
	
	private String roleName;
	
	TypKontaEnum(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
