package com.foodplace.test.modelo;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Cliente {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Date dataNasci;
	private int idade;
	private Long idCidade;
	
	@OneToOne
	private Cidade cidade;
	
	
	public Cliente( String nome, Date dataNasci, int idade, Long idCidade, Cidade cidade) {
		super();
		this.nome = nome;
		this.dataNasci = dataNasci;
		this.idade = idade;
		this.idCidade = idCidade;
	
		this.cidade = cidade;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasci() {
		return dataNasci;
	}
	public void setDataNasci(Date dataNasci) {
		this.dataNasci = dataNasci;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Long getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
}
