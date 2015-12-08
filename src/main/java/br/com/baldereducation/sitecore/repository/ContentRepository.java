package br.com.baldereducation.sitecore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.baldereducation.sitecore.model.domain.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
	public List<Content> findByLessonId(Long id);
}
