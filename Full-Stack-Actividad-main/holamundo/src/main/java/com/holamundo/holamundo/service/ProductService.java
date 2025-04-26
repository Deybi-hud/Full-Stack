package com.holamundo.holamundo.service;

import java.util.List;

import com.holamundo.holamundo.domain.Product;

public interface ProductService {

    //Para implemetar el metodo en todos los servicios
    public List<Product> getProducts(); 

}
