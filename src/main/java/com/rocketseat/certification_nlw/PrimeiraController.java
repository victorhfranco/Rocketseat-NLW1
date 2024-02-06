package com.rocketseat.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
	
	@GetMapping("/retornaPrimeiraController")
	public Usuario RetornoPrimeiraController() {
		var usuario = new Usuario("Victor", 24);
		return usuario;
	}
	
	@PostMapping("/meuPrimeiroPost")
	public	String primeiroPost() {
		return "Meu primeiro POST";
	}
	
	record Usuario(String nome, int idade) {
		
	}
}
