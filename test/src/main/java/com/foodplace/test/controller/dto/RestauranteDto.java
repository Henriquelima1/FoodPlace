package com.foodplace.test.controller.dto;


import java.time.LocalDateTime;

import com.foodplace.test.entidades.Restaurante;

import lombok.Data;
import lombok.Getter;


@Data
public class RestauranteDto {

	 private Long id;

	@Getter private String nome;
	@Getter private LocalDateTime convenio;
	@Getter private int idade;

	public RestauranteDto(Restaurante restaurante) {
		this.id = restaurante.getId();
		this.nome = restaurante.getNome();
		this.convenio = restaurante.getConvenio();

	}

	
	  public Long getId() { return id; }


}
