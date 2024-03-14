package com.gm2.dev.first_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstProjectApplication {
	/*
	Uma forma de fazer =>
	//declaramos que a classe terá um atributo do tipo AppConfiguration
	private AppConfiguration appConfiguration;

	//tenho que passar o constructor para que o spring container consiga instanciar automaticamente
	public FirstProjectApplication(AppConfiguration appConfiguration) {
		//não precisaremos instanciar nada por conta do springboot fazer automaticamente ou seja apenas criamos o constructor
		this.appConfiguration = appConfiguration;
	}
	*/

	//outra forma mais simples de fazermos sem nem codar o construtor é adicionar uma notation ao atributo
	//porem não é tão recomendado
	@Autowired
	private AppConfiguration appConfiguration;

	public static void main(String[] args) {
		//start do spring boot
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	//criou endpoint
	@GetMapping("/inicio")
	public String inicio() {
		return "Hello World";
	}

	@GetMapping("/config")
	public String config() {
		return this.appConfiguration.getMessage();
	}

}
