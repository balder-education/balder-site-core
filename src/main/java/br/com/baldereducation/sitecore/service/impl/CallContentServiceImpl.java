package br.com.baldereducation.sitecore.service.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.baldereducation.sitecore.model.domain.to.ContentTO;
import br.com.baldereducation.sitecore.service.CallContentService;

@Service
public class CallContentServiceImpl implements CallContentService {

	@Scheduled(initialDelay=1000, fixedRate=5000)
	public ContentTO getContent() {
		RestTemplate restTemplate = new RestTemplate();
		ContentTO contentTO = restTemplate.getForObject(
				"http://localhost:8080", ContentTO.class);

		return contentTO;
	}
}
