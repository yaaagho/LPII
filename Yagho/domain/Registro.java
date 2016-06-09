package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Registro implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int tipo;
	private String dataArrecadacao;
	private String dataRegistro;
	private String validade;
	private int quantidade;
	
	@ManyToOne
	private Usuario idUsuario;
	private Produto idProduto;
	private Membro idMembro;
	
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	public int getTipo(){return tipo;}
	public void setTipo(int tipo){this.tipo = tipo;}
	
	public String getDataArrecadacao(){return dataArrecadacao;}
	public void setDataArrecadacao(String dataArrecadacao){this.dataArrecadacao = dataArrecadacao;}
	
	public String getDataRegistro(){return dataRegistro;}
	public void setDataRegistro(String dataRegistro){this.dataRegistro = dataRegistro;}
	
	public String getValidade(){return validade;}
	public void setValidade(String validade){this.validade = validade;}
	
	public int getQuantidade(){return quantidade;}
	public void setQuantidade(int quantidade){this.quantidade = quantidade;}
	
	public Usuario getIdUsuario(){return idUsuario;}
	public void setIdUsuario(Usuario idUsuario){this.idUsuario = idUsuario;}
	
	public Produto getIdProduto(){return idProduto;}
	public void setIdProduto(Produto idProduto){this.idProduto = idProduto;}
	
	public Membro getIdMembro(){return idMembro;}
	public void setIdMembro(Membro idMembro){this.idMembro = idMembro;}

	@Override
	public String toString() {
		return "Registro [id=" + id + ", tipo=" + tipo + ", dataArrecadacao=" + dataArrecadacao + ", dataRegistro=" + dataRegistro + ", validade=" + validade + ",  quantidade=" + quantidade +  "]";
	}
	
}