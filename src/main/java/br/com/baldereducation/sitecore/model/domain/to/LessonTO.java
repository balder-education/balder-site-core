package br.com.baldereducation.sitecore.model.domain.to;

public class LessonTO {
	private Long id;
	private String description;
	private Long classId;
	private String image;

	public LessonTO() {
		super();
	}

	public LessonTO(Long id, String description, Long classId, String image) {
		super();
		this.id = id;
		this.description = description;
		this.classId = classId;
		this.image = image;
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

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
