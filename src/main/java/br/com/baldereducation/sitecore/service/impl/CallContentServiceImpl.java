package br.com.baldereducation.sitecore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.Content;
import br.com.baldereducation.sitecore.model.domain.to.ContentTO;
import br.com.baldereducation.sitecore.repository.ContentRepository;
import br.com.baldereducation.sitecore.service.CallContentService;
import br.com.baldereducation.sitecore.util.rest.AbstracRestTemplate;

@Service
public class CallContentServiceImpl extends AbstracRestTemplate implements CallContentService {

	@Autowired
	private ContentRepository contentRepository;
	
	@Scheduled(initialDelay=1000, fixedRate=5000)
	public ContentTO getContent() {
		ContentTO contentTO = getRestTemplate().getForObject(
				URL_APP_ADMIN, ContentTO.class);
		
		contentRepository.save(new Content(contentTO.getId(), contentTO.getDescription(), null, null, null));

		return contentTO;
	}
}
