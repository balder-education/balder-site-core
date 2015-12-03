package br.com.baldereducation.sitecore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.baldereducation.sitecore.model.domain.Content;
import br.com.baldereducation.sitecore.service.ContentService;

@RestController
@RequestMapping("/app/contents")
public class ContentResource {

	@Autowired
	private ContentService ContentService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Content> list() {
		return ContentService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Content findById(@PathVariable Long id) {
		return ContentService.findById(id);
	}
	
	/*@RequestMapping(method = RequestMethod.GET, value = "/clazz/{clazzId}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<ContentTO> findByClazz(@PathVariable Long clazzId) {
		return ContentService.findByClazz(clazzId);
	}*/
	
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Content create(@RequestBody @Valid Content content) {
		return ContentService.create(content);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Content update(@RequestBody @Valid Content content) {
		return ContentService.update(content);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@PathVariable Long id) {
		ContentService.delete(id);
	}
}
