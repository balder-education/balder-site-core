package br.com.baldereducation.sitecore.service;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.Lesson;

public interface LessonService extends GenericService<Lesson, Long> {
	List<Lesson> findByClazz(Long clazzId);
}
