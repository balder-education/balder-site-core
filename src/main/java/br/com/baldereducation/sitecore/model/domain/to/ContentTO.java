package br.com.baldereducation.sitecore.model.domain.to;

public class ContentTO {

	@SuppressWarnings("unused")
	private static final String URL_CLIENT = "api/contents";

	private Long id;
	private String description;
	private String tipoConteudo;
	private String tipoLevel;
	private int curso;

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

	public String getTipoConteudo() {
		return tipoConteudo;
	}

	public void setTipoConteudo(String tipoConteudo) {
		this.tipoConteudo = tipoConteudo;
	}

	public String getTipoLevel() {
		return tipoLevel;
	}

	public void setTipoLevel(String tipoLevel) {
		this.tipoLevel = tipoLevel;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

}
