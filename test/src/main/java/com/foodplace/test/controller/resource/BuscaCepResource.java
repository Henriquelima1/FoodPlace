package com.foodplace.test.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.foodplace.test.entidades.Cidade;
import com.foodplace.test.service.BuscaCepService;

@RestController
@RequestMapping("/Enderecos")
public class BuscaCepResource {

	private static final RestTemplate Endereco = null;

	private Cidade cidade;

	@Autowired
	private BuscaCepService buscaCepService;

	public String find() {
		buscaCepService.find(Endereco, cidade.getCep());
		return Endereco.toString();
	}

}
