package com.foodplace.test.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.foodplace.test.controller.dto.CidadeDto;
import com.foodplace.test.controller.form.CidadeForm;
import com.foodplace.test.entidades.Cidade;
import com.foodplace.test.repository.CidadeRepository;
import com.foodplace.test.repository.ClienteRepository;
import com.foodplace.test.service.CidadeService;

@RestController
@RequestMapping("/Cidade")
public class CidadeController {

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	CidadeRepository cidadeRepository;
	@Autowired
	private CidadeService cidadeService;

	@PostMapping("/cadastroCidade")
	@Transactional
	public ResponseEntity<CidadeDto> cadastroCidade(@RequestBody @Valid CidadeForm form,UriComponentsBuilder uriBuilder) {
		return cidadeService.cadastrar(form, uriBuilder);
	}

	@GetMapping("/consultaCidade/{nome}/{estado}")
	public ResponseEntity<Cidade> consultaCidade(@PathVariable("nome") String nome,@PathVariable("estado") String estado) {
		return cidadeService.consultar(nome, estado);
	}

}
