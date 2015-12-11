package br.com.baldereducation.sitecore.service;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.Content;
import br.com.baldereducation.sitecore.model.domain.to.ContentTO;

public interface ContentService extends GenericService<Content, Long> {
	public List<ContentTO> findByLesson(Long lessonId);
	public void finished(Long contentId, int status);
}
