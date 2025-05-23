package com.holamundo.holamundo.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.holamundo.holamundo.domain.Product;


@Service("listResourceService") //Le indicamos al contenedor de Spring que esta clase es un bean de servicio
public class ProductsServiceImpl implements ProductService{
    //Aqui va la logica del programa 

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(1, "Laptop", 799.99, 10),
        new Product(2, "Smartphone", 499.99, 25),
        new Product(3, "Tablet", 299.99, 15),
        new Product(4, "Smartwatch", 199.99, 30)
    ));


    @Override
    public  List<Product> getProducts(){
        return products;
    }
}
