package com.foodplace.test.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.foodplace.test.entidades.Cliente;
import com.foodplace.test.repository.ClienteRepository;

public class AtualizacaoClienteForm {

	@NotNull
	@NotEmpty
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente atualizar(Long id, ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.getOne(id);

		cliente.setNome(this.nome);

		return cliente;
	}

}
