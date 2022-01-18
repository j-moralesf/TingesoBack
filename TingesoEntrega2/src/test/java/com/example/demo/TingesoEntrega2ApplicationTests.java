package com.example.demo;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import com.example.demo.Modelos.Producto;
import com.example.demo.Repositorios.Producto_Repositorio;
import com.example.demo.Servicios.Producto_servicio;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("PruebasUnitarias")
@Tag("unit")
class TingesoEntrega2ApplicationTests {
	@Mock
	Producto_Repositorio repositorio;

	@InjectMocks
	Producto_servicio servicio;
	
	
	@Test
	@DisplayName("Precio correcto")
	void precioCorrecto()
	{
		Producto prueba = new Producto();
		int precio = 1000;
		prueba.setPrecio(precio);
		assertEquals(precio, prueba.getPrecio());
	}
	
	@Test
	@DisplayName("Precio invalido")
	void precioInvalido()
	{
		Producto prueba = new Producto();
		assertThrows(ProductoException.class, () -> {
            prueba.setPrecio(-1000);
        });
		
	}
	@Test
	@DisplayName("No existe producto")
	void noExisteProducto()
	{

		assertThrows(ProductoException.class, () -> {
            servicio.findById( (Long.valueOf(-1)) );
        });
		
	}

}
