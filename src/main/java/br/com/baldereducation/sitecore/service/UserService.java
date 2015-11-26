package br.com.baldereducation.sitecore.service;

import br.com.baldereducation.sitecore.model.domain.User;

public interface UserService {
	public User findUserByUsername(String username);
}
