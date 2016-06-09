package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import br.com.herbertrausch.util.SpringUtil;

public class RegistroService{

	
	private RegistroRepository db;
	
	public RegistroService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(RegistroRepository.class);
		
	}

	// Lista todos
	
	public List<Registro> getRegistros(){
		try{
			List<Registro> registros = (List<Registro>) db.findAll();	
			return registros;
		}catch (Exception e){
			e.printStackTrace();
			return new ArrayList<Registro>();
		}
	}
	
	public List<Registro> getByTipo(String a){
		return db.findByTipo(a);
	}

	public Registro getRegistro(Long id){
		try{
			return db.findOne(id);
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}


	// Deletar
	public boolean delete(Long id){
		try{
			db.delete(id);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}

	// Salvar ou atualizar
	public boolean save(Registro registro){
		try{
			db.save(registro);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}



}