package br.com.baldereducation.sitecore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.baldereducation.sitecore.model.domain.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
	List<Content> findByLessonId(Long id);
	
	@Query("select count(c.id) from br.com.baldereducation.sitecore.model.domain.Content c where c.lesson.id = :lessonId")
	int findContentByLessonId(@Param("lessonId") Long lessonId);
	
	List<Content> findByFinishedAndLessonId(boolean finished, Long lessonId);
}
