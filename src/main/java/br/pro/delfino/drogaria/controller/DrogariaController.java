package br.pro.delfino.drogaria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drogaria-spring")
public class DrogariaController {
	@GetMapping
	public String exibirMensagem() {
		return "Olá, mundo!";
	}
}
