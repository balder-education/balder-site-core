package br.com.baldereducation.sitecore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.baldereducation.sitecore.model.domain.Clazz;

public interface ClassRepository extends JpaRepository<Clazz, Long> {

}
