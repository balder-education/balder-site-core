package br.com.baldereducation.sitecore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.UserAccount;
import br.com.baldereducation.sitecore.repository.UserRepository;
import br.com.baldereducation.sitecore.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserAccount findUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public List<UserAccount> findAll() {
		return userRepository.findAll();
	}

	@Override
	public UserAccount create(UserAccount user) {
		return userRepository.save(user);
	}

	@Override
	public UserAccount update(UserAccount user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepository.delete(id);
	}

	@Override
	public UserAccount findById(Long id) {
		return userRepository.findOne(id);
	}

}
