package com.foodplace.test.controller.form;


import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import com.foodplace.test.entidades.Cidade;
import com.foodplace.test.entidades.Cliente;
import com.foodplace.test.repository.CidadeRepository;

public class ClienteForm {

	@NotNull
	@NotEmpty
	private String nome;


	@NotNull
	@NotEmpty
	private Date dataNasci;

	@NotNull
	@NotEmpty
	private int idade;

	@NotNull
	@NotEmpty
	private Long idCidade;

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
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

	public Cliente converter(CidadeRepository cidadeRepository) {
		Cidade cidadeConverte = cidadeRepository.findByIdCidade(idCidade);
		return new Cliente(nome, dataNasci, idade, idCidade, cidadeConverte);
	}

}
