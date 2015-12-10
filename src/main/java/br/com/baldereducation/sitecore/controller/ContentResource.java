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
import br.com.baldereducation.sitecore.model.domain.to.ContentTO;
import br.com.baldereducation.sitecore.service.ContentService;

@RestController
@RequestMapping("/app/contents")
public class ContentResource {

	@Autowired
	private ContentService contentService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Content> list() {
		return contentService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Content findById(@PathVariable Long id) {
		return contentService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/lesson/{lessonId}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ContentTO findByLesson(@PathVariable Long lessonId) {
		return contentService.findByLesson(lessonId);
	}	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Content create(@RequestBody @Valid Content content) {
		return contentService.create(content);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Content update(@RequestBody @Valid Content content) {
		return contentService.update(content);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{contentId}/status/{status}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void finished(@PathVariable("contentId") Long contentId, @PathVariable("status") int status) {
		contentService.finished(contentId, status);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@PathVariable Long id) {
		contentService.delete(id);
	}
}
