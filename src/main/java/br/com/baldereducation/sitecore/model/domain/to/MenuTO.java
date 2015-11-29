package br.com.baldereducation.sitecore.model.domain.to;

import java.io.Serializable;

public class MenuTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String link = null;
	private String title = null;
	private String icon = null;
	
	public MenuTO(String link, String title, String icon) {
		super();
		this.link = link;
		this.title = title;
		this.icon = icon;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
