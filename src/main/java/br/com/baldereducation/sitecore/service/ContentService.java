package br.com.baldereducation.sitecore.service;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.Content;

public interface ContentService extends GenericService<Content, Long> {
	List<Content> findByLesson(Long lessonId);
}
