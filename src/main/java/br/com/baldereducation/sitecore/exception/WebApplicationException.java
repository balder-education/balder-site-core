package br.com.baldereducation.sitecore.exception;

import org.springframework.http.HttpStatus;

public class WebApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	public WebApplicationException(final HttpStatus status) {
		super("Erro ao encontrar recurso! Error status: " + status);
	}

}
