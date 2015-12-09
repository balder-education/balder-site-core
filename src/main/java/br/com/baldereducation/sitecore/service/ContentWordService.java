package br.com.baldereducation.sitecore.service;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.ContentWord;
import br.com.baldereducation.sitecore.model.domain.to.ContentWordTO;

public interface ContentWordService extends GenericService<ContentWord, Long> {
	List<ContentWordTO> findByContent(Long contenId);
}
