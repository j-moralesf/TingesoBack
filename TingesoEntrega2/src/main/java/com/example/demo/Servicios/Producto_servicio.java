package com.example.demo.Servicios;

import java.util.List;
import java.util.Optional;

import com.example.demo.ProductoException;
import com.example.demo.Modelos.Producto;
import com.example.demo.Repositorios.Producto_Repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producto_servicio {

    private Producto_Repositorio producto_Repositorio;
    public Producto_servicio(Producto_Repositorio producto_Repositorio)
    {
        this.producto_Repositorio = producto_Repositorio;
    }
    // metodos del crud

    public Producto create (Producto producto){
       return producto_Repositorio.saveAndFlush(producto); 
    }
    //Martes Enero 2022
    public List<Producto> getAllProductos(){
        return producto_Repositorio.findAll();
    } 

    public void delete (Long producto){
        producto_Repositorio.deleteById(producto); 
    }  
    
    public Optional<Producto> findById (Long id){
        Optional<Producto> optionalProducto = producto_Repositorio.findById(id);
        if (!optionalProducto.isPresent()) {
            throw new ProductoException("Producto" + id + " not available");
        }
        return optionalProducto;

    }

}
