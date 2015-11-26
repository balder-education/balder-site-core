package br.com.baldereducation.sitecore.service.impl;

import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.User;
import br.com.baldereducation.sitecore.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	public User findUserByUsername(String username) {
		User user = new User();
		user.setEmail("fontestz@gmail.com");
		user.setUsername("rogeriofontes");
		user.setPassword("12345");
		return user;
	}

}
