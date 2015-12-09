package br.com.baldereducation.sitecore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.ContentWord;
import br.com.baldereducation.sitecore.model.domain.to.ContentWordTO;
import br.com.baldereducation.sitecore.repository.ContentWordRepository;
import br.com.baldereducation.sitecore.service.ContentWordService;

@Service
public class ContentWordServiceImpl implements ContentWordService {

	@Autowired
	private ContentWordRepository contentWordRepository;

	@Override
	public List<ContentWord> findAll() {
		return contentWordRepository.findAll();
	}

	@Override
	public ContentWord create(ContentWord contentWord) {
		return contentWordRepository.save(contentWord);
	}

	@Override
	public ContentWord update(ContentWord contentWord) {
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

	@Override
	public List<ContentWordTO> findByContent(Long contenId) {
		List<ContentWord> contentWords = contentWordRepository.findByContentId(contenId);
		List<ContentWordTO> contentWordsTO = new ArrayList<>();

		ContentWordTO contentWordTO = null;
		for (ContentWord contentWord : contentWords) {
			contentWordTO = new ContentWordTO();
			contentWordTO.setId(contentWord.getId());
			contentWordTO.setContentId(contentWord.getContent().getId());
			contentWordTO.setWord(contentWord.getWord());

			contentWordsTO.add(contentWordTO);
		}

		return contentWordsTO;
	}
}