package com.example.demo;

import com.example.demo.Modelos.Producto;
import com.example.demo.Repositorios.Producto_Repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TingesoEntrega2Application {

	public static void main(String[] args) {
		SpringApplication.run(TingesoEntrega2Application.class, args);
	}	

	@Autowired
	private Producto_Repositorio producto_Repositorio;


}
