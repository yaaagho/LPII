package br.com.lp2.spring.mongo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface EventoRepository extends MongoRepository<Evento, String>{
	
	List<Evento> findByTipo(int tipo);
	List<Evento> findByData(String data);
	List<Evento> findByNome(String nome);
	List<Evento> findAll(Sort sort);
}

