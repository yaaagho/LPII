package br.com.lp2.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import br.com.lp2.util.SpringUtil;

public class ProdutoService {

	private ProdutoRepository db;
	
	public ProdutoService() {
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ProdutoRepository.class);	
	}
	
    public Produto findOne(String id) {
        return db.findOne(id);
    }
 
	public List<Produto> findAll(Sort sort) {  
		  return db.findAll(sort);
		 }
	
	public List<Produto> findByNome(String nome){
			return db.findByNome(nome);
	}
	
	public List<Produto> findByQuantidade(Sort sort) {  
		  return db.findAll(sort);
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

	public boolean save(Produto produto){
		try{
			db.save(produto);
			return true;
		}catch (Exception a){
			a.printStackTrace();
			return false;
		}
	}
	
}