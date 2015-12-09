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

import br.com.baldereducation.sitecore.model.domain.ContentWord;
import br.com.baldereducation.sitecore.model.domain.to.ContentWordTO;
import br.com.baldereducation.sitecore.service.ContentWordService;

@RestController
@RequestMapping("/app/contentWords")
public class ContentWordResource {

	@Autowired
	private ContentWordService contentWordService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<ContentWord> list() {
		return contentWordService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ContentWord findById(@PathVariable Long id) {
		return contentWordService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/content/{contentId}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<ContentWordTO> findByLesson(@PathVariable Long contentId) {
		return contentWordService.findByContent(contentId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public ContentWord create(@RequestBody @Valid ContentWord contentWord) {
		return contentWordService.create(contentWord);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ContentWord update(@RequestBody @Valid ContentWord contentWord) {
		return contentWordService.update(contentWord);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@PathVariable Long id) {
		contentWordService.delete(id);
	}
}
