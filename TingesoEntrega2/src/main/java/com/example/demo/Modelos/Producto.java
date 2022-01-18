package com.example.demo.Modelos;

import java.security.PublicKey;
import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.ProductoException;
import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer codigo;
    private String nombre;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaVencimiento;
    private String categoria;
    private Integer precio;
    
    public Long getId(){
        return id;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        if(precio < 0){
            throw new ProductoException("Precio invalido: " + fechaVencimiento);
         }
        this.precio = precio;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento) {
        /* if(fechaVencimiento.after(java.sql.Time.valueOf(LocalTime.now()))){
           throw new ProductoException("Producto Vencido: " + fechaVencimiento);
        } */
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
