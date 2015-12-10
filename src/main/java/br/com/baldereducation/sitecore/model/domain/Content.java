package br.com.baldereducation.sitecore.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class Content implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;

	@ManyToOne
	@JoinColumn(name = "lesson_id")
	private Lesson lesson;

	private String image;

	@Column(name = "result_word")
	private String resultWord;

	private boolean finished;

	public Content() {
		super();
	}

	public Content(Long id, String description, Lesson lesson, String image,
			String resultWord) {
		super();
		this.id = id;
		this.description = description;
		this.lesson = lesson;
		this.image = image;
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

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
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
