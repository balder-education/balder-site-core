package br.com.baldereducation.sitecore.model.domain.to;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.Lesson;
import br.com.baldereducation.sitecore.model.domain.LessonWord;

public class LessonTO {
	private Lesson lesson;
	private List<LessonWord> lessonWords;

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public List<LessonWord> getLessonWords() {
		return lessonWords;
	}

	public void setLessonWords(List<LessonWord> lessonWords) {
		this.lessonWords = lessonWords;
	}

}
