package br.com.baldereducation.sitecore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.baldereducation.sitecore.model.domain.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
