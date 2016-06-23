package br.com.lp2.spring.mongo;


import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;
import br.com.lp2.util.SpringUtil;

public class FinanceiroService {

	private FinanceiroRepository db;
	
	public FinanceiroService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(FinanceiroRepository.class);	
	}
	
	public List<Financeiro> findAll(Sort sort) {  
		  return db.findAll(sort);
		 }
	
    public Financeiro findOne(String id) {
        return db.findOne(id);
    }
    
	public List<Financeiro> findByTipo(boolean a){
		return db.findByTipo(a);
	}
	
	public List<Financeiro> findByData(String data){
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
	
	public List<Financeiro> sortByQuantidade(Sort sort) {  
		  return db.findAll(sort);
		 }

	public boolean save(Financeiro registroFinanceiro){
		try{
			db.save(registroFinanceiro);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
}