package com.project.jpa.JavaJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpa.JavaJPA.model.Cliente;
import com.project.jpa.JavaJPA.repository.Clientes;


@RestController
@RequestMapping("api/JPA/clientes")
public class ClientesController {
	
	@Autowired
	private Clientes clientes;
	
	@GetMapping
	public List<Cliente> listar(){
		System.out.println("Quantidade de Registros de Clientes : " + clientes.count());
		return (clientes.findAll());
	}
		
}
