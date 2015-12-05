package br.com.baldereducation.sitecore.util.rest;

import org.springframework.web.client.RestTemplate;

public class AbstracRestTemplate {
	
	protected RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
