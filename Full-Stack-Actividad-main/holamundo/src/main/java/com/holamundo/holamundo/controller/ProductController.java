package com.holamundo.holamundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holamundo.holamundo.domain.Product;
import com.holamundo.holamundo.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/productos")
public class ProductController {


    //inyección de dependencia
    @Autowired
    @Qualifier("jsonResourceService")
    private ProductService productsService;

    @GetMapping
    public ResponseEntity<?> getProducts(){

        List<Product> products = productsService.getProducts();
            
        return ResponseEntity.ok(products);
    }

}
