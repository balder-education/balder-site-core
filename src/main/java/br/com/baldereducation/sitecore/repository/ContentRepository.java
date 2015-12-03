package br.com.baldereducation.sitecore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.baldereducation.sitecore.model.domain.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {

}
