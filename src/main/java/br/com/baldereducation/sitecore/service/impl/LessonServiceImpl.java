package br.com.baldereducation.sitecore.service.impl;

import java.util.ArrayList;
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
	public List<LessonTO> findByClazz(Long id) {
		List<LessonTO> lessonsTO = new ArrayList<>();
		LessonTO lessonTO = null;

		List<Lesson> lessons = lessonRepository.findByClazzId(id);
		for (Lesson lesson : lessons) {
			lessonTO = new LessonTO();
			if (lesson != null)
				lessonTO.setLesson(lesson);

			List<LessonWord> lessonWords = lessonWordRepository.findByLessonId(id);
			if (lessonWords != null)
				lessonTO.setLessonWords(lessonWords);

			lessonsTO.add(lessonTO);
		}

		return lessonsTO;
	}

}
