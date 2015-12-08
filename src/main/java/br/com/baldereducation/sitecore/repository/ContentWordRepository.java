package br.com.baldereducation.sitecore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.baldereducation.sitecore.model.domain.ContentWord;

public interface ContentWordRepository extends JpaRepository<ContentWord, Long> {
	public List<ContentWord> findByContentId(Long id);
}
