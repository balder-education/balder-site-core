package br.com.baldereducation.sitecore.service;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.ContentWord;

public interface ContentWordService extends GenericService<ContentWord, Long> {
	List<ContentWord> findByContent(Long contenId);
}
