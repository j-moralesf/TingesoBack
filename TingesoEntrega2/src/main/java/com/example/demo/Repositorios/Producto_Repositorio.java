package com.example.demo.Repositorios;

import com.example.demo.Modelos.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Producto_Repositorio extends JpaRepository<Producto, Long>{
    
}
