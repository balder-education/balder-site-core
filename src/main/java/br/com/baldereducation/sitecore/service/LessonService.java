package br.com.baldereducation.sitecore.service;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.Lesson;
import br.com.baldereducation.sitecore.model.domain.to.LessonTO;

public interface LessonService extends GenericService<Lesson, Long> {
	List<LessonTO> findByClazz(Long clazzId);
	boolean finishedLesson(Long lessonId);
	Long count();
}
