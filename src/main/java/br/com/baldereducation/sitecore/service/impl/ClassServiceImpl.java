package br.com.baldereducation.sitecore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.domain.Clazz;
import br.com.baldereducation.sitecore.repository.ClassRepository;
import br.com.baldereducation.sitecore.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService {
	
	@Autowired
	private ClassRepository classRepository;
	
	@Override
	public List<Clazz> findAll() {
		return classRepository.findAll();
	}

	@Override
	public Clazz create(Clazz clazz) {
		return classRepository.save(clazz);
	}

	@Override
	public Clazz update(Clazz clazz) {
		return classRepository.save(clazz);
	}

	@Override
	public void delete(Long id) {
		 classRepository.delete(id);
	}

	@Override
	public Clazz findById(Long id) {
		return classRepository.findOne(id);
	}
}
