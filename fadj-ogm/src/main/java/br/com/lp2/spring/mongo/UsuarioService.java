package br.com.lp2.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import br.com.lp2.util.SpringUtil;

public class UsuarioService {

	private UsuarioRepository db;
	
	public UsuarioService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(UsuarioRepository.class);	
	}
	
    public Usuario findOne(String id) {
        return db.findOne(id);
    }
 
	public List<Usuario> findAll(Sort sort) {  
		  return db.findAll(sort);
		 }
	
	public List<Usuario> findByNome(String nome){
			return db.findByNome(nome);
	}

	public boolean delete(String id){
		try{
			db.delete(id);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}

	public boolean save(Usuario usuario){
		try{
			db.save(usuario);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
}