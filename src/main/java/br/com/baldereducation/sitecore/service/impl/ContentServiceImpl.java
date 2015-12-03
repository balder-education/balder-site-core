package br.com.baldereducation.sitecore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.Content;
import br.com.baldereducation.sitecore.repository.ContentRepository;
import br.com.baldereducation.sitecore.repository.ContentWordRepository;
import br.com.baldereducation.sitecore.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentRepository contentRepository;

	@Autowired
	private ContentWordRepository lessonWordRepository;

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
}
