package br.com.baldereducation.sitecore.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T, ID extends Serializable> {
	public List<T> findAll();
	public T create(T t);
	public T update(T t);
	public void delete(ID id);
	public T findById(ID id);
}
