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

import br.com.baldereducation.sitecore.model.domain.Clazz;
import br.com.baldereducation.sitecore.service.ClassService;

@RestController
@RequestMapping("/app/classes")
public class ClassResource {
	
	@Autowired
	private ClassService classServeice;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Clazz> list() {
		return classServeice.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Clazz findById(@PathVariable Long id) {
		return classServeice.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Clazz create(@RequestBody @Valid Clazz clazz) {
		return classServeice.create(clazz);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Clazz update(@RequestBody @Valid Clazz clazz) {
		return classServeice.update(clazz);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@PathVariable Long id) {
		classServeice.delete(id);
	}
}
