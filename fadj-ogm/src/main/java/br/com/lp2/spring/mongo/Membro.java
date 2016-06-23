package br.com.lp2.spring.mongo;

import java.io.Serializable;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Membro implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome, telefone, endereco, bairro, cidade, estado, cep;
	private int qtdMembros;
	private boolean tipo;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public int getQtdMembros() {
		return qtdMembros;
	}
	
	public void setQtdMembros(int qtdMembros) {
		this.qtdMembros = qtdMembros;
	}
	
	public boolean getTipo() {
		return tipo;
	}
	
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
}