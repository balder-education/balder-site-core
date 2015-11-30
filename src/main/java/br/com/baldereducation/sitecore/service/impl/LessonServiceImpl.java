package br.com.baldereducation.sitecore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.Lesson;
import br.com.baldereducation.sitecore.model.domain.LessonWord;
import br.com.baldereducation.sitecore.model.domain.to.LessonTO;
import br.com.baldereducation.sitecore.repository.LessonRepository;
import br.com.baldereducation.sitecore.repository.LessonWordRepository;
import br.com.baldereducation.sitecore.service.LessonService;

@Service
public class LessonServiceImpl implements LessonService {

	@Autowired
	private LessonRepository lessonRepository;

	@Autowired
	private LessonWordRepository lessonWordRepository;

	@Override
	public List<Lesson> findAll() {
		return lessonRepository.findAll();
	}

	@Override
	public Lesson create(Lesson lesson) {
		return lessonRepository.save(lesson);
	}

	@Override
	public Lesson update(Lesson lesson) {
		return lessonRepository.save(lesson);
	}

	@Override
	public void delete(Long id) {
		lessonRepository.delete(id);
	}

	@Override
	public Lesson findById(Long id) {
		return lessonRepository.findOne(id);
	}

	@Override
	public LessonTO findByClazzId(Long id) {
		LessonTO lessonTO = new LessonTO();
		List<LessonWord> lessonWords = lessonWordRepository.findByLesson(id);

		if (lessonWords != null)
			lessonTO.setLessonWords(lessonWords);

		Lesson lesson = findById(id);
		if (lesson != null)
			lessonTO.setLesson(lesson);
		
		return lessonTO;
	}

}
