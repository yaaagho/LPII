package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RegistroRepository extends CrudRepository<Registro, Long>{
	
	List<Registro> findByTipo(String tipo);
	
}