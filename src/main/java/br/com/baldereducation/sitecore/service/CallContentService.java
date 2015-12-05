package br.com.baldereducation.sitecore.service;

import br.com.baldereducation.sitecore.model.domain.to.ContentTO;

public interface CallContentService {
	public static final String URL_APP_ADMIN = "http://localhost:8080/balder-admin-web/rest/conteudo/todos";
	
	public ContentTO getContent();
}
