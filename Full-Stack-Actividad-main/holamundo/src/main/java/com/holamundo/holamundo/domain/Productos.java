package com.holamundo.holamundo.domain;

public class Productos {
    private int ID;
    private String nombre;
    private double precio;

    public Productos(int iD, String nombre, double precio) {
        ID = iD;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
}
