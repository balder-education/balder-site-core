package br.com.baldereducation.sitecore.model.domain.to;

public class ContentWordTO {

	private Long id;
	private Long contentId;
	private String word;
	
	public ContentWordTO() {
		super();
	}

	public ContentWordTO(Long id, Long contentId, String word) {
		super();
		this.id = id;
		this.contentId = contentId;
		this.word = word;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getContentId() {
		return contentId;
	}

	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
