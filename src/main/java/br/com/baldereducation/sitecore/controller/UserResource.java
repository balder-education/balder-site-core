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

import br.com.baldereducation.sitecore.exception.WebApplicationException;
import br.com.baldereducation.sitecore.model.domain.UserAccount;
import br.com.baldereducation.sitecore.service.UserService;

@RestController
@RequestMapping("/app/users")
public class UserResource {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/username/{username}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public UserAccount findUserByUsername(@PathVariable String username) throws WebApplicationException {
		if (username == null)
			throw new WebApplicationException(HttpStatus.NOT_FOUND);

		return userService.findUserByUsername(username);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<UserAccount> list() {
		return userService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public UserAccount findById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public UserAccount create(@RequestBody @Valid UserAccount user) {
		return userService.create(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public UserAccount update(@RequestBody @Valid UserAccount user) {
		return userService.update(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@PathVariable Long id) {
		userService.delete(id);
	}
}
