package br.com.lp2.spring.mongo;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;
import br.com.lp2.util.SpringUtil;

public class EstoqueService {

	private EstoqueRepository db;
	
	public EstoqueService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(EstoqueRepository.class);	
	}
	
    public Estoque findOne(String id) {
        return db.findOne(id);
    }
 
	public List<Estoque> findAll(Sort sort) {  
		  return db.findAll(sort);
		 }
    
	public List<Estoque> findByTipo(boolean a){
		return db.findByTipo(a);
	}
	
	public List<Estoque> findByData(String data){
		return db.findByData(data);
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
	
	public List<Estoque> sortByQuantidade(Sort sort) {  
		  return db.findAll(sort);
		 }

	public boolean save(Estoque registroEstoque){
		try{
			db.save(registroEstoque);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
}