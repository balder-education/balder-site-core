package br.com.baldereducation.sitecore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.baldereducation.sitecore.model.domain.LessonWord;

public interface LessonWordRepository extends JpaRepository<LessonWord, Long> {
	public List<LessonWord> findByLessonId(Long id);
}
