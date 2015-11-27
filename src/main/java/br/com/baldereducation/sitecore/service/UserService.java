package br.com.baldereducation.sitecore.service;

import br.com.baldereducation.sitecore.model.domain.User;

public interface UserService extends GenericService<User, Long> {
	public User findUserByUsername(String username);
}
