package br.com.lp2.spring.mongo;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;
import br.com.lp2.util.SpringUtil;

public class MembroService {

	private MembroRepository db;
	
	public MembroService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(MembroRepository.class);	
	}
	
    public Membro findOne(String id) {
        return db.findOne(id);
    }
 
	public List<Membro> findAll(Sort sort) {  
		  return db.findAll(sort);
		 }
	
	public List<Membro> findByTipo(boolean a){
		return db.findByTipo(a);
	}
	
	public List<Membro> findByNome(String nome){
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

	public boolean save(Membro membro){
		try{
			db.save(membro);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
}