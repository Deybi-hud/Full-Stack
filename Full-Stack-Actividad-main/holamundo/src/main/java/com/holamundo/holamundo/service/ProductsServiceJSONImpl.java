package com.holamundo.holamundo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.holamundo.holamundo.domain.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import  com.fasterxml.jackson.databind.ObjectMapper;


@Service("jsonResourceService") 
public class ProductsServiceJSONImpl implements ProductService {

    @Override
    public List<Product> getProducts() {
        List<Product> products;
        
        //Lee los productos que estan en el archivo formato JSON
        try{
                products =  new ObjectMapper().readValue(this.getClass().getResourceAsStream("/products.json"),
                 new TypeReference<List<Product>>() {});
                return products;
                            
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    













}
