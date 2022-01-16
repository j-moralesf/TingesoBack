package com.example.demo;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.List;

import com.example.demo.Repositorios.Producto_Repositorio;
import com.example.demo.Servicios.Producto_servicio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("PruebasUnitarias")
@Tag("unit")
class TingesoEntrega2ApplicationTests {
	@InjectMocks
	Producto_servicio servicio;
	@Mock
	Producto_Repositorio repositorio;

	@Test
	@DisplayName("Prueba 1")
	void contextLoads() {
		int prueba = 2;
		assertEquals(prueba,2);
	}

}
