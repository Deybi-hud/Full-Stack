package com.holamundo.holamundo.domain;

public class Product {

    private Integer id;
    private String name;
    private Double preci;
    private Integer stock;
    

    
    public Product(Integer id, String name, Double preci, Integer stock) {
        this.id = id;
        this.name = name;
        this.preci = preci;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public Double getPreci() {
        return preci;
    }

    public void setPreci(Double precio) {
        this.preci = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    

}
