package br.com.baldereducation.sitecore.model.controls;

public enum Menu {
	MENU_DASHBOARD("/#/", "Dashboard", "dashboard", true), MENU_CLASS(
			"/#/class", "Classes", "message", true), MENU_LESSON("/#/lesson",
			"Lesson", "group", true),  MENU_CONTENT("/#/content",
					"Content", "group", true);

	private String link = null;
	private String title = null;
	private String icon = null;
	private boolean active = false;

	private Menu(String link, String title, String icon, boolean active) {
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
