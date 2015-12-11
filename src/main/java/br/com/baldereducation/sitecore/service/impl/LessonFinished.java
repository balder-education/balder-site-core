package br.com.baldereducation.sitecore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.Lesson;
import br.com.baldereducation.sitecore.repository.LessonRepository;
import br.com.baldereducation.sitecore.service.LessonService;

@Service
public class LessonFinished {
	
	@Autowired
	private LessonService lessonService;
	
	@Autowired
	private LessonRepository lessonRepository;
	
	//@Scheduled(initialDelay=1000, fixedRate=5000)
	public void setClosed() {
		List<Lesson> lessons = lessonRepository.findAll();
		
		for (Lesson lesson : lessons) {
			boolean closed = lessonService.finishedLesson(lesson.getId());
			System.out.println("Lisson id: " + lesson.getId() + "closed: " + closed);
			
			//[TODO] - Passar sysout para log4j
		}

	}
}
