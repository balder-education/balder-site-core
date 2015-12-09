package br.com.baldereducation.sitecore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.Lesson;
import br.com.baldereducation.sitecore.model.domain.to.LessonTO;
import br.com.baldereducation.sitecore.repository.LessonRepository;
import br.com.baldereducation.sitecore.service.LessonService;

@Service
public class LessonServiceImpl implements LessonService {

	@Autowired
	private LessonRepository lessonRepository;

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
	public List<LessonTO> findByClazz(Long clazzId) {
		List<Lesson> lessons = lessonRepository.findByClazzId(clazzId);
		List<LessonTO> lessonsTO = new ArrayList<>();

		LessonTO lessonTO = null;
		for (Lesson lesson : lessons) {
			lessonTO = new LessonTO();
			lessonTO.setId(lesson.getId());
			lessonTO.setDescription(lesson.getDescription());
			lessonTO.setClassId(lesson.getClazz().getId());
			lessonTO.setImage(lesson.getImage());
			
			lessonsTO.add(lessonTO);
		}

		return lessonsTO;
	}
}
