package com.recordatorios.app.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.controllers")
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);

		int numero = 12;
		boolean esPar = numero % 2 == 0;
		String mensaje = esPar ? "Es par" : "Es impar";
	}



}
