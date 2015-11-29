package br.com.baldereducation.sitecore.model.controls;

public enum MenuAdmin {
	MENU_DASHBOARD("/#/", "Trash", "delete", true), 
	MENU_LESSON("/#/showListBottomSheet($event)", "Settings", "settings", true),;
	
	private String link = null;
	private String title = null;
	private String icon = null;
	private boolean active = false;

	private MenuAdmin(String link, String title, String icon, boolean active) {
		this.link = link;
		this.title = title;
		this.icon = icon;
		this.active = active;
	}

	public String getLink() {
		return link;
	}

	public String getTitle() {
		return title;
	}

	public String getIcon() {
		return icon;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
