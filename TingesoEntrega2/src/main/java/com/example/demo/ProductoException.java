package com.example.demo;


public class ProductoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ProductoException(String cause) {
        super(cause);
    }
}
