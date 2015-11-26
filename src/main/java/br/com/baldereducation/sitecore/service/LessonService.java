package br.com.baldereducation.sitecore.service;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.Lesson;

public interface LessonService {
	public List<Lesson> findAll();
}
