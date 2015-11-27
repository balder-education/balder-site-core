package br.com.baldereducation.sitecore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.baldereducation.sitecore.model.domain.UserAccount;

@Repository
public interface UserRepository extends JpaRepository<UserAccount, Long>{
	UserAccount findByUsername(String username);
    UserAccount findByEmail(String email);
    UserAccount findByUsernameAndPassword(String username, String password);
}
