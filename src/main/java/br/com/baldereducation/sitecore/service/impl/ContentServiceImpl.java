package br.com.baldereducation.sitecore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.Content;
import br.com.baldereducation.sitecore.model.domain.to.ContentTO;
import br.com.baldereducation.sitecore.repository.ContentRepository;
import br.com.baldereducation.sitecore.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentRepository contentRepository;

	@Override
	public List<Content> findAll() {
		return contentRepository.findAll();
	}

	@Override
	public Content create(Content content) {
		return contentRepository.save(content);
	}

	@Override
	public Content update(Content content) {
		return contentRepository.save(content);
	}

	@Override
	public void delete(Long id) {
		contentRepository.delete(id);
	}

	@Override
	public Content findById(Long id) {
		return contentRepository.findOne(id);
	}

	@Override
	public List<ContentTO> findByLesson(Long lessonId) {
		List<Content> contents = contentRepository.findByLessonId(lessonId);
		List<ContentTO> contentsTO = new ArrayList<>();

		ContentTO contentTO = null;
		for (Content content : contents) {
			contentTO = new ContentTO();
			contentTO.setId(content.getId());
			contentTO.setDescription(content.getDescription());
			contentTO.setLessonId(content.getLesson().getId());
			contentTO.setImage(content.getImage());
			contentTO.setResultWord(content.getResultWord());
			
			contentsTO.add(contentTO);
		}

		return contentsTO;
	}
}
