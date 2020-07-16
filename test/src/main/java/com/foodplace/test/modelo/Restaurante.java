package com.foodplace.test.modelo;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Restaurante {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDateTime convenio;
	private Long idCidade;
	
	@OneToOne
	private Cidade cidade;
	
	
	public Restaurante( String nome, LocalDateTime convenio, Long idCidade, Cidade cidade) {
		super();
		this.nome = nome;
		this.convenio = convenio;
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
	public LocalDateTime getConvenio() {
		return convenio;
	}
	public void setConvenio(LocalDateTime convenio) {
		this.convenio = convenio;
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