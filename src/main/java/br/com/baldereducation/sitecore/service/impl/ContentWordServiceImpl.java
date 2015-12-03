package br.com.baldereducation.sitecore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.ContentWord;
import br.com.baldereducation.sitecore.repository.ContentWordRepository;
import br.com.baldereducation.sitecore.service.ContentWordService;

@Service
public class ContentWordServiceImpl implements ContentWordService {

	@Autowired
	private ContentWordRepository contentWordRepository;

	@Override
	public List< ContentWord> findAll() {
		return contentWordRepository.findAll();
	}

	@Override
	public  ContentWord create( ContentWord  contentWord) {
		return contentWordRepository.save(contentWord);
	}

	@Override
	public  ContentWord update(ContentWord  contentWord) {
		return contentWordRepository.save(contentWord);
	}

	@Override
	public void delete(Long id) {
		contentWordRepository.delete(id);
	}

	@Override
	public ContentWord findById(Long id) {
		return contentWordRepository.findOne(id);
	}
}
