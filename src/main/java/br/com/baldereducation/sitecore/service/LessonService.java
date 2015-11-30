package br.com.baldereducation.sitecore.service;

import br.com.baldereducation.sitecore.model.domain.Lesson;
import br.com.baldereducation.sitecore.model.domain.to.LessonTO;

public interface LessonService extends GenericService<Lesson, Long> {
	public LessonTO findByClazzId(Long id);
}
