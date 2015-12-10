package br.com.baldereducation.sitecore.service;

import br.com.baldereducation.sitecore.model.domain.Content;
import br.com.baldereducation.sitecore.model.domain.to.ContentTO;

public interface ContentService extends GenericService<Content, Long> {
	public ContentTO findByLesson(Long lessonId);
	public void finished(Long contentId, int status);
}
