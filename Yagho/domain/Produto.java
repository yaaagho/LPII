package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int quantidade;
	
	@ManyToOne
	private Usuario idUsuario;
	
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	public String getNome(){return nome;}
	public void setNome(String nome){this.nome = nome;}
	
	public int getQuantidade(){return quantidade;}
	public void setQuantidade(int quantidade){this.quantidade = quantidade;}
	
	public Usuario getIdUsuario(){return idUsuario;}
	public void setIdUsuario(Usuario idUsuario){this.idUsuario = idUsuario;}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ",  quantidade=" + quantidade +  "]";
	}
	
}