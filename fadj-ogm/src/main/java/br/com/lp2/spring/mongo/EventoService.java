package br.com.lp2.spring.mongo;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import br.com.lp2.util.SpringUtil;

public class EventoService {

	private EventoRepository db;
	
	public EventoService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(EventoRepository.class);	
	}
	
	public List<Evento> findAll(Sort sort) {  
		  return db.findAll(sort);
		 }
	
    public Evento findOne(String id) {
        return db.findOne(id);
    }
	
	public List<Evento> findByTipo(int a){
		return db.findByTipo(a);
	}
	
	public List<Evento> findByNome(String nome){
			return db.findByNome(nome);
	}
	
	public List<Evento> findByData(String data){
		return db.findByData(data);
	}

	public boolean delete(String id) {
		try {
			db.delete(id);
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean save(Evento evento) {
		try {
				db.save(evento);
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}