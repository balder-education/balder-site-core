package br.com.baldereducation.sitecore.service;

import br.com.baldereducation.sitecore.model.domain.UserAccount;

public interface UserService extends GenericService<UserAccount, Long> {
	public UserAccount findUserByUsername(String username);
}
