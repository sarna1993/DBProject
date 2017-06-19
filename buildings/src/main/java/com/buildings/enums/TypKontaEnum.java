package com.buildings.enums;

public enum TypKontaEnum {

	LOKATOR("LOKATOR", "tenantAuth"),
	KSIEGOWA("KSIEGOWA", "receptionistAuth"),
	TECHNICZNY("TECHNICZNY", "technicalAuth"),
	MANAGER("MANAGER", "managerAuth"),
	ADMIN("ADMIN", "adminAuth");
	
	private String roleName;
	private String panelName;
	
	TypKontaEnum(String roleName, String panelName) {
		this.roleName = roleName;
		this.panelName = panelName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getPanelName() {
		return panelName;
	}

	public void setPanelName(String panelName) {
		this.panelName = panelName;
	}
}
