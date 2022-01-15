package com.example.demo.Rest;


import java.net.URI;
import java.sql.Date;
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletRequest;

import com.example.demo.Modelos.Producto;
import com.example.demo.Servicios.Producto_servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/producto/")
public class Producto_rest {
    
    @Autowired
    private Producto_servicio producto_servicio;
    @PostMapping
    private ResponseEntity<Producto> guardar (@RequestBody Producto producto){
        Producto productoTemporal = producto_servicio.create(producto);

        try{
            return ResponseEntity.created(new URI("/api/producto" + productoTemporal.getId())).body(productoTemporal);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build( );
        }
    }


    @GetMapping
    private ResponseEntity<List<Producto>> listarTodosLosProductos (){
        return ResponseEntity.ok(producto_servicio.getAllProductos());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminarProducto (@RequestBody Producto producto){
        producto_servicio.delete(producto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Producto>> listarUnProducto (@PathVariable("id") Long id){
        return ResponseEntity.ok(producto_servicio.findById(id));
    }
        
}
