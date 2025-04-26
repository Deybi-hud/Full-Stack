package com.holamundo.holamundo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holamundo.holamundo.domain.Product;
import com.holamundo.holamundo.service.ProductsServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/productos")
public class ProductController {

    //Se crea el obejto 
    ProductsServiceImpl productsServiceImpl = new ProductsServiceImpl();

    @GetMapping
    public ResponseEntity<?> getProducts(){

        List<Product> products = productsServiceImpl.getProducts();
            
        return ResponseEntity.ok(products);
    }
}
