package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import br.com.herbertrausch.util.SpringUtil;

public class ProdutoService{

	
	private ProdutoRepository db;
	
	public ProdutoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ProdutoRepository.class);
		
	}

	// Lista todos
	
	public List<Produto> getProdutos(){
		try{
			List<Produto> produtos = (List<Produto>) db.findAll();	
			return produtos;
		}catch (Exception e){
			e.printStackTrace();
			return new ArrayList<Produto>();
		}
	}

	public Produto getProduto(Long id){
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
	public boolean save(Produto produto){
		try{
			db.save(produto);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}



}