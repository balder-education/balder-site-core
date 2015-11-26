package br.com.baldereducation.sitecore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.baldereducation.sitecore.exception.WebApplicationException;
import br.com.baldereducation.sitecore.model.domain.User;
import br.com.baldereducation.sitecore.service.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
    
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{username}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public User findUserByUsername(@PathVariable String username) throws WebApplicationException {
		if (username == null) 
			throw new WebApplicationException(HttpStatus.NOT_FOUND);
			
        return userService.findUserByUsername(username);
    }

}
