package com.example.demo.Servicios;

import java.util.List;
import java.util.Optional;

import com.example.demo.Modelos.Producto;
import com.example.demo.Repositorios.Producto_Repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producto_servicio {

    @Autowired
    private Producto_Repositorio producto_Repositorio;

    // metodos del crud

    public Producto create (Producto producto){
       return producto_Repositorio.save(producto); 
    }

    public List<Producto> getAllProductos(){
        return producto_Repositorio.findAll();
    } 

    public void delete (Producto producto){
        producto_Repositorio.delete(producto); 
    }  
    
    public Optional<Producto> findById (Long id){
        return producto_Repositorio.findById(id); 
    }

}
