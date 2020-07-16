package com.foodplace.test.controller.dto;


import java.util.Date;

import com.foodplace.test.entidades.Cliente;

import lombok.Data;
import lombok.Getter;


@Data

public class ClienteDto {

	 private Long id;

	@Getter private String nome;
	@Getter private Date dataNasci;
	@Getter private int idade;

	public ClienteDto(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.dataNasci = cliente.getDataNasci();
		this.idade = cliente.getIdade();
	}

	
	  public Long getId() { return id; }


}
