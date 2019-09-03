package br.com.myhelper.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="modulo")
public class MenuSitemaEntity implements Serializable {
 
	private static final long serialVersionUID = 3L;
 
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="idpai")
	private int idpai;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="novajanela")
	private String novajanela;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdpai() {
		return idpai;
	}

	public void setIdpai(int idpai) {
		this.idpai = idpai;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNovajanela() {
		return novajanela;
	}

	public void setNovajanela(String novajanela) {
		this.novajanela = novajanela;
	}
	
 

}