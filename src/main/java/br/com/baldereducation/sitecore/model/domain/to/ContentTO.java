package br.com.baldereducation.sitecore.model.domain.to;

public class ContentTO {

	private Long id;
	private String description;
	private Long lessonId;
	private String image;
	private boolean finished;
	private String resultWord;

	public ContentTO() {
		super();
	}

	public ContentTO(Long id, String description, Long lessonId, String image,
			boolean finished, String resultWord) {
		super();
		this.id = id;
		this.description = description;
		this.lessonId = lessonId;
		this.image = image;
		this.finished = finished;
		this.resultWord = resultWord;
	}

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

	public Long getLessonId() {
		return lessonId;
	}

	public void setLessonId(Long lessonId) {
		this.lessonId = lessonId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getResultWord() {
		return resultWord;
	}

	public void setResultWord(String resultWord) {
		this.resultWord = resultWord;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

}
