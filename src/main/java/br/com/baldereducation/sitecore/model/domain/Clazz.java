/**
 * 
 */
package br.com.baldereducation.sitecore.model.domain;

import java.io.Serializable;

/**
 * @author rogerio.tomaz
 *
 */
public class Clazz implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
